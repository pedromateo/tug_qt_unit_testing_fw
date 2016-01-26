/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage
 * @generated
 */
public class Qt48XmlschemaQwtEnhancedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Qt48XmlschemaQwtEnhancedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlschemaQwtEnhancedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Qt48XmlschemaQwtEnhancedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Qt48XmlschemaQwtEnhancedSwitch<Adapter> modelSwitch =
		new Qt48XmlschemaQwtEnhancedSwitch<Adapter>() {
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseActionGroup(ActionGroup object) {
				return createActionGroupAdapter();
			}
			@Override
			public Adapter caseActionRef(ActionRef object) {
				return createActionRefAdapter();
			}
			@Override
			public Adapter caseBrush(Brush object) {
				return createBrushAdapter();
			}
			@Override
			public Adapter caseButtonGroup(ButtonGroup object) {
				return createButtonGroupAdapter();
			}
			@Override
			public Adapter caseButtonGroups(ButtonGroups object) {
				return createButtonGroupsAdapter();
			}
			@Override
			public Adapter caseChar(Char object) {
				return createCharAdapter();
			}
			@Override
			public Adapter caseColor(Color object) {
				return createColorAdapter();
			}
			@Override
			public Adapter caseColorGroup(ColorGroup object) {
				return createColorGroupAdapter();
			}
			@Override
			public Adapter caseColorRole(ColorRole object) {
				return createColorRoleAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseConnectionHint(ConnectionHint object) {
				return createConnectionHintAdapter();
			}
			@Override
			public Adapter caseConnectionHints(ConnectionHints object) {
				return createConnectionHintsAdapter();
			}
			@Override
			public Adapter caseConnections(Connections object) {
				return createConnectionsAdapter();
			}
			@Override
			public Adapter caseCustomWidget(CustomWidget object) {
				return createCustomWidgetAdapter();
			}
			@Override
			public Adapter caseCustomWidgets(CustomWidgets object) {
				return createCustomWidgetsAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseDesignerData(DesignerData object) {
				return createDesignerDataAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFont(Font object) {
				return createFontAdapter();
			}
			@Override
			public Adapter caseGradient(Gradient object) {
				return createGradientAdapter();
			}
			@Override
			public Adapter caseGradientStop(GradientStop object) {
				return createGradientStopAdapter();
			}
			@Override
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseImageData(ImageData object) {
				return createImageDataAdapter();
			}
			@Override
			public Adapter caseImages(Images object) {
				return createImagesAdapter();
			}
			@Override
			public Adapter caseInclude(Include object) {
				return createIncludeAdapter();
			}
			@Override
			public Adapter caseIncludes(Includes object) {
				return createIncludesAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseLayoutDefault(LayoutDefault object) {
				return createLayoutDefaultAdapter();
			}
			@Override
			public Adapter caseLayoutFunction(LayoutFunction object) {
				return createLayoutFunctionAdapter();
			}
			@Override
			public Adapter caseLayoutItem(LayoutItem object) {
				return createLayoutItemAdapter();
			}
			@Override
			public Adapter caseLocale(Locale object) {
				return createLocaleAdapter();
			}
			@Override
			public Adapter casePalette(Palette object) {
				return createPaletteAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter casePointF(PointF object) {
				return createPointFAdapter();
			}
			@Override
			public Adapter caseProperties(Properties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter casePropertyData(PropertyData object) {
				return createPropertyDataAdapter();
			}
			@Override
			public Adapter casePropertySpecifications(PropertySpecifications object) {
				return createPropertySpecificationsAdapter();
			}
			@Override
			public Adapter caseRect(Rect object) {
				return createRectAdapter();
			}
			@Override
			public Adapter caseRectF(RectF object) {
				return createRectFAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceIcon(ResourceIcon object) {
				return createResourceIconAdapter();
			}
			@Override
			public Adapter caseResourcePixmap(ResourcePixmap object) {
				return createResourcePixmapAdapter();
			}
			@Override
			public Adapter caseResources(Resources object) {
				return createResourcesAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseSize(Size object) {
				return createSizeAdapter();
			}
			@Override
			public Adapter caseSizeF(SizeF object) {
				return createSizeFAdapter();
			}
			@Override
			public Adapter caseSizePolicy(SizePolicy object) {
				return createSizePolicyAdapter();
			}
			@Override
			public Adapter caseSizePolicyData(SizePolicyData object) {
				return createSizePolicyDataAdapter();
			}
			@Override
			public Adapter caseSlots(Slots object) {
				return createSlotsAdapter();
			}
			@Override
			public Adapter caseSpacer(Spacer object) {
				return createSpacerAdapter();
			}
			@Override
			public Adapter caseString(org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseStringList(StringList object) {
				return createStringListAdapter();
			}
			@Override
			public Adapter caseStringPropertySpecification(StringPropertySpecification object) {
				return createStringPropertySpecificationAdapter();
			}
			@Override
			public Adapter caseTabStops(TabStops object) {
				return createTabStopsAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseUI(UI object) {
				return createUIAdapter();
			}
			@Override
			public Adapter caseUrl(Url object) {
				return createUrlAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseWidgetData(WidgetData object) {
				return createWidgetDataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup
	 * @generated
	 */
	public Adapter createActionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionRef <em>Action Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionRef
	 * @generated
	 */
	public Adapter createActionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush <em>Brush</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush
	 * @generated
	 */
	public Adapter createBrushAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup <em>Button Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroup
	 * @generated
	 */
	public Adapter createButtonGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroups <em>Button Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ButtonGroups
	 * @generated
	 */
	public Adapter createButtonGroupsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char
	 * @generated
	 */
	public Adapter createCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup <em>Color Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorGroup
	 * @generated
	 */
	public Adapter createColorGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorRole <em>Color Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ColorRole
	 * @generated
	 */
	public Adapter createColorRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint <em>Connection Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHint
	 * @generated
	 */
	public Adapter createConnectionHintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHints <em>Connection Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHints
	 * @generated
	 */
	public Adapter createConnectionHintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connections
	 * @generated
	 */
	public Adapter createConnectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget <em>Custom Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget
	 * @generated
	 */
	public Adapter createCustomWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidgets <em>Custom Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidgets
	 * @generated
	 */
	public Adapter createCustomWidgetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DesignerData <em>Designer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DesignerData
	 * @generated
	 */
	public Adapter createDesignerDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font
	 * @generated
	 */
	public Adapter createFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient
	 * @generated
	 */
	public Adapter createGradientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop <em>Gradient Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop
	 * @generated
	 */
	public Adapter createGradientStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ImageData
	 * @generated
	 */
	public Adapter createImageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Images <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Images
	 * @generated
	 */
	public Adapter createImagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Includes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Includes
	 * @generated
	 */
	public Adapter createIncludesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault <em>Layout Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault
	 * @generated
	 */
	public Adapter createLayoutDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutFunction <em>Layout Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutFunction
	 * @generated
	 */
	public Adapter createLayoutFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem <em>Layout Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem
	 * @generated
	 */
	public Adapter createLayoutItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale
	 * @generated
	 */
	public Adapter createLocaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette
	 * @generated
	 */
	public Adapter createPaletteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF <em>Point F</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF
	 * @generated
	 */
	public Adapter createPointFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertyData <em>Property Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertyData
	 * @generated
	 */
	public Adapter createPropertyDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertySpecifications <em>Property Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PropertySpecifications
	 * @generated
	 */
	public Adapter createPropertySpecificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect
	 * @generated
	 */
	public Adapter createRectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF <em>Rect F</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF
	 * @generated
	 */
	public Adapter createRectFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon <em>Resource Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon
	 * @generated
	 */
	public Adapter createResourceIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap <em>Resource Pixmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap
	 * @generated
	 */
	public Adapter createResourcePixmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources
	 * @generated
	 */
	public Adapter createResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF <em>Size F</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF
	 * @generated
	 */
	public Adapter createSizeFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy <em>Size Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy
	 * @generated
	 */
	public Adapter createSizePolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicyData <em>Size Policy Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicyData
	 * @generated
	 */
	public Adapter createSizePolicyDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Slots
	 * @generated
	 */
	public Adapter createSlotsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer <em>Spacer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer
	 * @generated
	 */
	public Adapter createSpacerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringList <em>String List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringList
	 * @generated
	 */
	public Adapter createStringListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification <em>String Property Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringPropertySpecification
	 * @generated
	 */
	public Adapter createStringPropertySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.TabStops <em>Tab Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.TabStops
	 * @generated
	 */
	public Adapter createTabStopsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.UI
	 * @generated
	 */
	public Adapter createUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url
	 * @generated
	 */
	public Adapter createUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.WidgetData <em>Widget Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.WidgetData
	 * @generated
	 */
	public Adapter createWidgetDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Qt48XmlschemaQwtEnhancedAdapterFactory
