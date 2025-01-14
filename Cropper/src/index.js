import _widgetBase from 'MxWidgetBase';
import declare from 'dojoBaseDeclare';
import * as widgetConf from '../conf/widget.config.json';
import {
    isMxImageObject
} from "./helpers/utils";

//import dependencies
import $ from "jquery";
require('imports-loader?jQuery=jquery!../node_modules/jquery-jcrop/js/jquery.Jcrop');
require('imports-loader?jQuery=jquery!../node_modules/jquery-jcrop/js/jquery.color');
import './style/style.scss';
import "jquery-jcrop/css/Jcrop.gif";
import "jquery-jcrop/css/jquery.Jcrop.min.css";


export default declare(`${widgetConf.name}.widget.${widgetConf.name}`, [_widgetBase], {

    // INTERNAL
    _contextObject: null,
    imgNode: null,
    fileID: null,
    aspectR: 0,
    scaleRatio: 1,
    JCropAPI: null,

    postCreate() {
        logger.debug(`${this.id} >> postCreate`);
        $(this.domNode).addClass("jcrop-mx-widget");
        $(this.domNode).attr("tabIndex", -1);

        this.JCropAPI = null;
        this.addOnDestroy(() => {
            this.JCropAPI && this.JCropAPI.destroy && this.JCropAPI.destroy();
        });
    },

    update(contextObject, callback) {
        logger.debug(`${this.id} >> update`);

        if (contextObject && isMxImageObject(contextObject)) {
            this._contextObject = contextObject;
            this.fileID = this._contextObject.get('FileID');
            this._updateRendering(callback);
            this._addSubscriptions();
        } else {
            this._handleError(`${widgetConf.name} should be initiated in a nonempty context object that inherits from 'System.Image' Entity.`);
            this._executeCallback(callback);
        }
    },

    _addSubscriptions() {
        logger.debug(`${this.id} >> _addSubscriptions`);
        this.unsubscribeAll();
        this.subscribe({
            guid: this._contextObject.getGuid(),
            callback: $.proxy(() => {
                logger.debug(`${this.id} >> subscription has been set successfully`);
                this._updateRendering();
            }, this)
        });
    },

    _updateRendering(callback) {
        logger.debug(`${this.id} >> _updateRendering`);
        var src = '/file?fileID=' + this.fileID + '&' + (+new Date()).toString(36);
        if (this.imgNode === null) {
            $(this.domNode).empty();
            this.imgNode = $("<img>").attr("src", src).css("display", "none");
            $(this.imgNode).appendTo(this.domNode);
        } else {
            $(this.imgNode).attr("src", src);
        }
        this._initJCrop(callback);
    },

    _initJCrop(callback) {
        logger.debug(`${this.id} >> _initJCrop`);
        if (this.JCropAPI !== null && this.JCropAPI.destroy) {
            // destroy current JCrop instance, in order to reset
            this.JCropAPI.destroy();
            this.JCropAPI = null;
        }

        var widget = this;
        var cropOptions = this._getCroppingOptions();

        $(this.imgNode).Jcrop(cropOptions, function () {
            logger.debug(`${widget.id} >> _getReferenceToJCropInstance`);
            widget.JCropAPI = this;
            widget._executeCallback(callback);
        });
    },

    _handleError(errorMessage) {
        logger.debug(`${this.id} >> _handleError`);
        $(this.domNode).empty();
        $("<div>").addClass("alert alert-danger").text(errorMessage).appendTo(this.domNode);
    },

    _setCroppingCoordinates(coordinates) {
        logger.debug(`${this.id} >> _setCroppingCoordinates`);
        if (coordinates) {
            this._contextObject.set('crop_x1', Math.round(coordinates.x));
            this._contextObject.set('crop_x2', Math.round(coordinates.x2));
            this._contextObject.set('crop_y1', Math.round(coordinates.y));
            this._contextObject.set('crop_y2', Math.round(coordinates.y2));
            this._contextObject.set('crop_height', Math.round(coordinates.h));
            this._contextObject.set('crop_width', Math.round(coordinates.w));
        }

    },
    _getCroppingOptions() {
        logger.debug(`${this.id} >> _getCroppingOptions`);
        var options = {};
        options.aspectRatio = this._getAspectRatio();
        options.bgColor = 'transparent';
        options.bgOpacity = 0.4;
        options.onSelect = $.proxy(this._setCroppingCoordinates, this);
        options.onChange = $.proxy(this._setCroppingCoordinates, this);
        options.onRelease = $.proxy(this._setCroppingCoordinates, this);

        var selectWidth = this._contextObject._getAttributeValue('crop_start_width');
        var selectHeight = this._contextObject._getAttributeValue('crop_start_height');

        if (selectHeight == null) {
            selectHeight = this.startheight;
        }
        if (selectWidth == null) {
            selectWidth = this.startwidth;
        }
        
        options.setSelect = [0, 0, selectWidth, selectHeight];
        options.boxWidth = this.domNode.parentNode.clientWidth;
        options.boxHeight = this.cropheight;

        return options;
    },
    _getAspectRatio() {
        logger.debug(`${this.id} >> _getAspectRatio`);
        var aspectRatio = null,
            aspectRatioArr = null,
            givenWidth = null,
            givenHeight = null;
        aspectRatioArr = this._contextObject.get(this.aspectRatio).split(':');
        givenWidth = parseInt(aspectRatioArr[0], 10);
        givenHeight = parseInt(aspectRatioArr[1], 10);
        aspectRatio = givenWidth / givenHeight;
        return aspectRatio;
    },

    _executeCallback(callback) {
        if (callback && typeof callback === "function") {
            callback();
        }
    }

});
