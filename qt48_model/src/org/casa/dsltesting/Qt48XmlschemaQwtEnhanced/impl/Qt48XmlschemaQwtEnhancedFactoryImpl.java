/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionRef;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroups;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorRole;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Column;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHints;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connections;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidgets;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DesignerData;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Header;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Image;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Images;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Includes;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutFunction;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Properties;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertyData;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertySpecifications;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedFactory;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resource;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Row;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicyData;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringList;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.TabStops;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.WidgetData;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Qt48XmlschemaQwtEnhancedFactoryImpl extends EFactoryImpl implements Qt48XmlschemaQwtEnhancedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Qt48XmlschemaQwtEnhancedFactory init() {
		try {
			Qt48XmlschemaQwtEnhancedFactory theQt48XmlschemaQwtEnhancedFactory = (Qt48XmlschemaQwtEnhancedFactory)EPackage.Registry.INSTANCE.getEFactory(Qt48XmlschemaQwtEnhancedPackage.eNS_URI);
			if (theQt48XmlschemaQwtEnhancedFactory != null) {
				return theQt48XmlschemaQwtEnhancedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Qt48XmlschemaQwtEnhancedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlschemaQwtEnhancedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Qt48XmlschemaQwtEnhancedPackage.ACTION: return createAction();
			case Qt48XmlschemaQwtEnhancedPackage.ACTION_GROUP: return createActionGroup();
			case Qt48XmlschemaQwtEnhancedPackage.ACTION_REF: return createActionRef();
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH: return createBrush();
			case Qt48XmlschemaQwtEnhancedPackage.BUTTON_GROUP: return createButtonGroup();
			case Qt48XmlschemaQwtEnhancedPackage.BUTTON_GROUPS: return createButtonGroups();
			case Qt48XmlschemaQwtEnhancedPackage.CHAR: return createChar();
			case Qt48XmlschemaQwtEnhancedPackage.COLOR: return createColor();
			case Qt48XmlschemaQwtEnhancedPackage.COLOR_GROUP: return createColorGroup();
			case Qt48XmlschemaQwtEnhancedPackage.COLOR_ROLE: return createColorRole();
			case Qt48XmlschemaQwtEnhancedPackage.COLUMN: return createColumn();
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION: return createConnection();
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION_HINT: return createConnectionHint();
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION_HINTS: return createConnectionHints();
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTIONS: return createConnections();
			case Qt48XmlschemaQwtEnhancedPackage.CUSTOM_WIDGET: return createCustomWidget();
			case Qt48XmlschemaQwtEnhancedPackage.CUSTOM_WIDGETS: return createCustomWidgets();
			case Qt48XmlschemaQwtEnhancedPackage.DATE: return createDate();
			case Qt48XmlschemaQwtEnhancedPackage.DATE_TIME: return createDateTime();
			case Qt48XmlschemaQwtEnhancedPackage.DESIGNER_DATA: return createDesignerData();
			case Qt48XmlschemaQwtEnhancedPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case Qt48XmlschemaQwtEnhancedPackage.FONT: return createFont();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT: return createGradient();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT_STOP: return createGradientStop();
			case Qt48XmlschemaQwtEnhancedPackage.HEADER: return createHeader();
			case Qt48XmlschemaQwtEnhancedPackage.IMAGE: return createImage();
			case Qt48XmlschemaQwtEnhancedPackage.IMAGE_DATA: return createImageData();
			case Qt48XmlschemaQwtEnhancedPackage.IMAGES: return createImages();
			case Qt48XmlschemaQwtEnhancedPackage.INCLUDE: return createInclude();
			case Qt48XmlschemaQwtEnhancedPackage.INCLUDES: return createIncludes();
			case Qt48XmlschemaQwtEnhancedPackage.ITEM: return createItem();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT: return createLayout();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_DEFAULT: return createLayoutDefault();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_FUNCTION: return createLayoutFunction();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM: return createLayoutItem();
			case Qt48XmlschemaQwtEnhancedPackage.LOCALE: return createLocale();
			case Qt48XmlschemaQwtEnhancedPackage.PALETTE: return createPalette();
			case Qt48XmlschemaQwtEnhancedPackage.POINT: return createPoint();
			case Qt48XmlschemaQwtEnhancedPackage.POINT_F: return createPointF();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTIES: return createProperties();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY: return createProperty();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY_DATA: return createPropertyData();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY_SPECIFICATIONS: return createPropertySpecifications();
			case Qt48XmlschemaQwtEnhancedPackage.RECT: return createRect();
			case Qt48XmlschemaQwtEnhancedPackage.RECT_F: return createRectF();
			case Qt48XmlschemaQwtEnhancedPackage.RESOURCE: return createResource();
			case Qt48XmlschemaQwtEnhancedPackage.RESOURCE_ICON: return createResourceIcon();
			case Qt48XmlschemaQwtEnhancedPackage.RESOURCE_PIXMAP: return createResourcePixmap();
			case Qt48XmlschemaQwtEnhancedPackage.RESOURCES: return createResources();
			case Qt48XmlschemaQwtEnhancedPackage.ROW: return createRow();
			case Qt48XmlschemaQwtEnhancedPackage.SCRIPT: return createScript();
			case Qt48XmlschemaQwtEnhancedPackage.SIZE: return createSize();
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_F: return createSizeF();
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY: return createSizePolicy();
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY_DATA: return createSizePolicyData();
			case Qt48XmlschemaQwtEnhancedPackage.SLOTS: return createSlots();
			case Qt48XmlschemaQwtEnhancedPackage.SPACER: return createSpacer();
			case Qt48XmlschemaQwtEnhancedPackage.STRING: return createString();
			case Qt48XmlschemaQwtEnhancedPackage.STRING_LIST: return createStringList();
			case Qt48XmlschemaQwtEnhancedPackage.STRING_PROPERTY_SPECIFICATION: return createStringPropertySpecification();
			case Qt48XmlschemaQwtEnhancedPackage.TAB_STOPS: return createTabStops();
			case Qt48XmlschemaQwtEnhancedPackage.TIME: return createTime();
			case Qt48XmlschemaQwtEnhancedPackage.UI: return createUI();
			case Qt48XmlschemaQwtEnhancedPackage.URL: return createUrl();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET: return createWidget();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET_DATA: return createWidgetData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroup createActionGroup() {
		ActionGroupImpl actionGroup = new ActionGroupImpl();
		return actionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRef createActionRef() {
		ActionRefImpl actionRef = new ActionRefImpl();
		return actionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brush createBrush() {
		BrushImpl brush = new BrushImpl();
		return brush;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonGroup createButtonGroup() {
		ButtonGroupImpl buttonGroup = new ButtonGroupImpl();
		return buttonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonGroups createButtonGroups() {
		ButtonGroupsImpl buttonGroups = new ButtonGroupsImpl();
		return buttonGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorGroup createColorGroup() {
		ColorGroupImpl colorGroup = new ColorGroupImpl();
		return colorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorRole createColorRole() {
		ColorRoleImpl colorRole = new ColorRoleImpl();
		return colorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionHint createConnectionHint() {
		ConnectionHintImpl connectionHint = new ConnectionHintImpl();
		return connectionHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionHints createConnectionHints() {
		ConnectionHintsImpl connectionHints = new ConnectionHintsImpl();
		return connectionHints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connections createConnections() {
		ConnectionsImpl connections = new ConnectionsImpl();
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomWidget createCustomWidget() {
		CustomWidgetImpl customWidget = new CustomWidgetImpl();
		return customWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomWidgets createCustomWidgets() {
		CustomWidgetsImpl customWidgets = new CustomWidgetsImpl();
		return customWidgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignerData createDesignerData() {
		DesignerDataImpl designerData = new DesignerDataImpl();
		return designerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gradient createGradient() {
		GradientImpl gradient = new GradientImpl();
		return gradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientStop createGradientStop() {
		GradientStopImpl gradientStop = new GradientStopImpl();
		return gradientStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageData createImageData() {
		ImageDataImpl imageData = new ImageDataImpl();
		return imageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Images createImages() {
		ImagesImpl images = new ImagesImpl();
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Includes createIncludes() {
		IncludesImpl includes = new IncludesImpl();
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDefault createLayoutDefault() {
		LayoutDefaultImpl layoutDefault = new LayoutDefaultImpl();
		return layoutDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutFunction createLayoutFunction() {
		LayoutFunctionImpl layoutFunction = new LayoutFunctionImpl();
		return layoutFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutItem createLayoutItem() {
		LayoutItemImpl layoutItem = new LayoutItemImpl();
		return layoutItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale createLocale() {
		LocaleImpl locale = new LocaleImpl();
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette createPalette() {
		PaletteImpl palette = new PaletteImpl();
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointF createPointF() {
		PointFImpl pointF = new PointFImpl();
		return pointF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyData createPropertyData() {
		PropertyDataImpl propertyData = new PropertyDataImpl();
		return propertyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertySpecifications createPropertySpecifications() {
		PropertySpecificationsImpl propertySpecifications = new PropertySpecificationsImpl();
		return propertySpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rect createRect() {
		RectImpl rect = new RectImpl();
		return rect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectF createRectF() {
		RectFImpl rectF = new RectFImpl();
		return rectF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceIcon createResourceIcon() {
		ResourceIconImpl resourceIcon = new ResourceIconImpl();
		return resourceIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap createResourcePixmap() {
		ResourcePixmapImpl resourcePixmap = new ResourcePixmapImpl();
		return resourcePixmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources createResources() {
		ResourcesImpl resources = new ResourcesImpl();
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeF createSizeF() {
		SizeFImpl sizeF = new SizeFImpl();
		return sizeF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizePolicy createSizePolicy() {
		SizePolicyImpl sizePolicy = new SizePolicyImpl();
		return sizePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizePolicyData createSizePolicyData() {
		SizePolicyDataImpl sizePolicyData = new SizePolicyDataImpl();
		return sizePolicyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slots createSlots() {
		SlotsImpl slots = new SlotsImpl();
		return slots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spacer createSpacer() {
		SpacerImpl spacer = new SpacerImpl();
		return spacer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringList createStringList() {
		StringListImpl stringList = new StringListImpl();
		return stringList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPropertySpecification createStringPropertySpecification() {
		StringPropertySpecificationImpl stringPropertySpecification = new StringPropertySpecificationImpl();
		return stringPropertySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabStops createTabStops() {
		TabStopsImpl tabStops = new TabStopsImpl();
		return tabStops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI createUI() {
		UIImpl ui = new UIImpl();
		return ui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url createUrl() {
		UrlImpl url = new UrlImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetData createWidgetData() {
		WidgetDataImpl widgetData = new WidgetDataImpl();
		return widgetData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlschemaQwtEnhancedPackage getQt48XmlschemaQwtEnhancedPackage() {
		return (Qt48XmlschemaQwtEnhancedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Qt48XmlschemaQwtEnhancedPackage getPackage() {
		return Qt48XmlschemaQwtEnhancedPackage.eINSTANCE;
	}

} //Qt48XmlschemaQwtEnhancedFactoryImpl
