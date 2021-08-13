// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package imagecrop.proxies;

public class CropImage extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ImageCrop.CropImage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		crop_x1("crop_x1"),
		crop_x2("crop_x2"),
		crop_y1("crop_y1"),
		crop_y2("crop_y2"),
		crop_height("crop_height"),
		crop_width("crop_width"),
		AspectRatio("AspectRatio"),
		IsDraft("IsDraft"),
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		CropImage_DraftCropImage("ImageCrop.CropImage_DraftCropImage");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public CropImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ImageCrop.CropImage"));
	}

	protected CropImage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cropImageMendixObject)
	{
		super(context, cropImageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("ImageCrop.CropImage", cropImageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ImageCrop.CropImage");
	}

	/**
	 * @deprecated Use 'CropImage.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static imagecrop.proxies.CropImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return imagecrop.proxies.CropImage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static imagecrop.proxies.CropImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new imagecrop.proxies.CropImage(context, mendixObject);
	}

	public static imagecrop.proxies.CropImage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return imagecrop.proxies.CropImage.initialize(context, mendixObject);
	}

	public static java.util.List<imagecrop.proxies.CropImage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<imagecrop.proxies.CropImage> result = new java.util.ArrayList<imagecrop.proxies.CropImage>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ImageCrop.CropImage" + xpathConstraint))
			result.add(imagecrop.proxies.CropImage.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of crop_x1
	 */
	public final java.lang.Integer getcrop_x1()
	{
		return getcrop_x1(getContext());
	}

	/**
	 * @param context
	 * @return value of crop_x1
	 */
	public final java.lang.Integer getcrop_x1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.crop_x1.toString());
	}

	/**
	 * Set value of crop_x1
	 * @param crop_x1
	 */
	public final void setcrop_x1(java.lang.Integer crop_x1)
	{
		setcrop_x1(getContext(), crop_x1);
	}

	/**
	 * Set value of crop_x1
	 * @param context
	 * @param crop_x1
	 */
	public final void setcrop_x1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer crop_x1)
	{
		getMendixObject().setValue(context, MemberNames.crop_x1.toString(), crop_x1);
	}

	/**
	 * @return value of crop_x2
	 */
	public final java.lang.Integer getcrop_x2()
	{
		return getcrop_x2(getContext());
	}

	/**
	 * @param context
	 * @return value of crop_x2
	 */
	public final java.lang.Integer getcrop_x2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.crop_x2.toString());
	}

	/**
	 * Set value of crop_x2
	 * @param crop_x2
	 */
	public final void setcrop_x2(java.lang.Integer crop_x2)
	{
		setcrop_x2(getContext(), crop_x2);
	}

	/**
	 * Set value of crop_x2
	 * @param context
	 * @param crop_x2
	 */
	public final void setcrop_x2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer crop_x2)
	{
		getMendixObject().setValue(context, MemberNames.crop_x2.toString(), crop_x2);
	}

	/**
	 * @return value of crop_y1
	 */
	public final java.lang.Integer getcrop_y1()
	{
		return getcrop_y1(getContext());
	}

	/**
	 * @param context
	 * @return value of crop_y1
	 */
	public final java.lang.Integer getcrop_y1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.crop_y1.toString());
	}

	/**
	 * Set value of crop_y1
	 * @param crop_y1
	 */
	public final void setcrop_y1(java.lang.Integer crop_y1)
	{
		setcrop_y1(getContext(), crop_y1);
	}

	/**
	 * Set value of crop_y1
	 * @param context
	 * @param crop_y1
	 */
	public final void setcrop_y1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer crop_y1)
	{
		getMendixObject().setValue(context, MemberNames.crop_y1.toString(), crop_y1);
	}

	/**
	 * @return value of crop_y2
	 */
	public final java.lang.Integer getcrop_y2()
	{
		return getcrop_y2(getContext());
	}

	/**
	 * @param context
	 * @return value of crop_y2
	 */
	public final java.lang.Integer getcrop_y2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.crop_y2.toString());
	}

	/**
	 * Set value of crop_y2
	 * @param crop_y2
	 */
	public final void setcrop_y2(java.lang.Integer crop_y2)
	{
		setcrop_y2(getContext(), crop_y2);
	}

	/**
	 * Set value of crop_y2
	 * @param context
	 * @param crop_y2
	 */
	public final void setcrop_y2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer crop_y2)
	{
		getMendixObject().setValue(context, MemberNames.crop_y2.toString(), crop_y2);
	}

	/**
	 * @return value of crop_height
	 */
	public final java.lang.Integer getcrop_height()
	{
		return getcrop_height(getContext());
	}

	/**
	 * @param context
	 * @return value of crop_height
	 */
	public final java.lang.Integer getcrop_height(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.crop_height.toString());
	}

	/**
	 * Set value of crop_height
	 * @param crop_height
	 */
	public final void setcrop_height(java.lang.Integer crop_height)
	{
		setcrop_height(getContext(), crop_height);
	}

	/**
	 * Set value of crop_height
	 * @param context
	 * @param crop_height
	 */
	public final void setcrop_height(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer crop_height)
	{
		getMendixObject().setValue(context, MemberNames.crop_height.toString(), crop_height);
	}

	/**
	 * @return value of crop_width
	 */
	public final java.lang.Integer getcrop_width()
	{
		return getcrop_width(getContext());
	}

	/**
	 * @param context
	 * @return value of crop_width
	 */
	public final java.lang.Integer getcrop_width(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.crop_width.toString());
	}

	/**
	 * Set value of crop_width
	 * @param crop_width
	 */
	public final void setcrop_width(java.lang.Integer crop_width)
	{
		setcrop_width(getContext(), crop_width);
	}

	/**
	 * Set value of crop_width
	 * @param context
	 * @param crop_width
	 */
	public final void setcrop_width(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer crop_width)
	{
		getMendixObject().setValue(context, MemberNames.crop_width.toString(), crop_width);
	}

	/**
	 * @return value of AspectRatio
	 */
	public final java.lang.String getAspectRatio()
	{
		return getAspectRatio(getContext());
	}

	/**
	 * @param context
	 * @return value of AspectRatio
	 */
	public final java.lang.String getAspectRatio(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AspectRatio.toString());
	}

	/**
	 * Set value of AspectRatio
	 * @param aspectratio
	 */
	public final void setAspectRatio(java.lang.String aspectratio)
	{
		setAspectRatio(getContext(), aspectratio);
	}

	/**
	 * Set value of AspectRatio
	 * @param context
	 * @param aspectratio
	 */
	public final void setAspectRatio(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String aspectratio)
	{
		getMendixObject().setValue(context, MemberNames.AspectRatio.toString(), aspectratio);
	}

	/**
	 * @return value of IsDraft
	 */
	public final java.lang.Boolean getIsDraft()
	{
		return getIsDraft(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDraft
	 */
	public final java.lang.Boolean getIsDraft(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsDraft.toString());
	}

	/**
	 * Set value of IsDraft
	 * @param isdraft
	 */
	public final void setIsDraft(java.lang.Boolean isdraft)
	{
		setIsDraft(getContext(), isdraft);
	}

	/**
	 * Set value of IsDraft
	 * @param context
	 * @param isdraft
	 */
	public final void setIsDraft(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isdraft)
	{
		getMendixObject().setValue(context, MemberNames.IsDraft.toString(), isdraft);
	}

	/**
	 * @return value of CropImage_DraftCropImage
	 */
	public final imagecrop.proxies.CropImage getCropImage_DraftCropImage() throws com.mendix.core.CoreException
	{
		return getCropImage_DraftCropImage(getContext());
	}

	/**
	 * @param context
	 * @return value of CropImage_DraftCropImage
	 */
	public final imagecrop.proxies.CropImage getCropImage_DraftCropImage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		imagecrop.proxies.CropImage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CropImage_DraftCropImage.toString());
		if (identifier != null)
			result = imagecrop.proxies.CropImage.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CropImage_DraftCropImage
	 * @param cropimage_draftcropimage
	 */
	public final void setCropImage_DraftCropImage(imagecrop.proxies.CropImage cropimage_draftcropimage)
	{
		setCropImage_DraftCropImage(getContext(), cropimage_draftcropimage);
	}

	/**
	 * Set value of CropImage_DraftCropImage
	 * @param context
	 * @param cropimage_draftcropimage
	 */
	public final void setCropImage_DraftCropImage(com.mendix.systemwideinterfaces.core.IContext context, imagecrop.proxies.CropImage cropimage_draftcropimage)
	{
		if (cropimage_draftcropimage == null)
			getMendixObject().setValue(context, MemberNames.CropImage_DraftCropImage.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CropImage_DraftCropImage.toString(), cropimage_draftcropimage.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final imagecrop.proxies.CropImage that = (imagecrop.proxies.CropImage) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ImageCrop.CropImage";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}