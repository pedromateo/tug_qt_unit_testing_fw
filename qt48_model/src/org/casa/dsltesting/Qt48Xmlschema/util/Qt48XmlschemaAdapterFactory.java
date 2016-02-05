/**
 */
package org.casa.dsltesting.Qt48Xmlschema.util;

import org.casa.dsltesting.Qt48Xmlschema.Action;
import org.casa.dsltesting.Qt48Xmlschema.ActionGroup;
import org.casa.dsltesting.Qt48Xmlschema.ActionRef;
import org.casa.dsltesting.Qt48Xmlschema.Brush;
import org.casa.dsltesting.Qt48Xmlschema.ButtonGroup;
import org.casa.dsltesting.Qt48Xmlschema.ButtonGroups;
import org.casa.dsltesting.Qt48Xmlschema.Char;
import org.casa.dsltesting.Qt48Xmlschema.Color;
import org.casa.dsltesting.Qt48Xmlschema.ColorGroup;
import org.casa.dsltesting.Qt48Xmlschema.ColorRole;
import org.casa.dsltesting.Qt48Xmlschema.Column;
import org.casa.dsltesting.Qt48Xmlschema.Connection;
import org.casa.dsltesting.Qt48Xmlschema.ConnectionHint;
import org.casa.dsltesting.Qt48Xmlschema.ConnectionHints;
import org.casa.dsltesting.Qt48Xmlschema.Connections;
import org.casa.dsltesting.Qt48Xmlschema.CustomWidget;
import org.casa.dsltesting.Qt48Xmlschema.CustomWidgets;
import org.casa.dsltesting.Qt48Xmlschema.Date;
import org.casa.dsltesting.Qt48Xmlschema.DateTime;
import org.casa.dsltesting.Qt48Xmlschema.DesignerData;
import org.casa.dsltesting.Qt48Xmlschema.DocumentRoot;
import org.casa.dsltesting.Qt48Xmlschema.Font;
import org.casa.dsltesting.Qt48Xmlschema.Gradient;
import org.casa.dsltesting.Qt48Xmlschema.GradientStop;
import org.casa.dsltesting.Qt48Xmlschema.Header;
import org.casa.dsltesting.Qt48Xmlschema.Image;
import org.casa.dsltesting.Qt48Xmlschema.ImageData;
import org.casa.dsltesting.Qt48Xmlschema.Images;
import org.casa.dsltesting.Qt48Xmlschema.Include;
import org.casa.dsltesting.Qt48Xmlschema.Includes;
import org.casa.dsltesting.Qt48Xmlschema.Item;
import org.casa.dsltesting.Qt48Xmlschema.Layout;
import org.casa.dsltesting.Qt48Xmlschema.LayoutDefault;
import org.casa.dsltesting.Qt48Xmlschema.LayoutFunction;
import org.casa.dsltesting.Qt48Xmlschema.LayoutItem;
import org.casa.dsltesting.Qt48Xmlschema.Locale;
import org.casa.dsltesting.Qt48Xmlschema.Palette;
import org.casa.dsltesting.Qt48Xmlschema.Point;
import org.casa.dsltesting.Qt48Xmlschema.PointF;
import org.casa.dsltesting.Qt48Xmlschema.Properties;
import org.casa.dsltesting.Qt48Xmlschema.Property;
import org.casa.dsltesting.Qt48Xmlschema.PropertyData;
import org.casa.dsltesting.Qt48Xmlschema.PropertySpecifications;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.casa.dsltesting.Qt48Xmlschema.Rect;
import org.casa.dsltesting.Qt48Xmlschema.RectF;
import org.casa.dsltesting.Qt48Xmlschema.Resource;
import org.casa.dsltesting.Qt48Xmlschema.ResourceIcon;
import org.casa.dsltesting.Qt48Xmlschema.ResourcePixmap;
import org.casa.dsltesting.Qt48Xmlschema.Resources;
import org.casa.dsltesting.Qt48Xmlschema.Row;
import org.casa.dsltesting.Qt48Xmlschema.Script;
import org.casa.dsltesting.Qt48Xmlschema.Size;
import org.casa.dsltesting.Qt48Xmlschema.SizeF;
import org.casa.dsltesting.Qt48Xmlschema.SizePolicy;
import org.casa.dsltesting.Qt48Xmlschema.SizePolicyData;
import org.casa.dsltesting.Qt48Xmlschema.Slots;
import org.casa.dsltesting.Qt48Xmlschema.Spacer;
import org.casa.dsltesting.Qt48Xmlschema.StringList;
import org.casa.dsltesting.Qt48Xmlschema.StringPropertySpecification;
import org.casa.dsltesting.Qt48Xmlschema.TabStops;
import org.casa.dsltesting.Qt48Xmlschema.Time;
import org.casa.dsltesting.Qt48Xmlschema.UI;
import org.casa.dsltesting.Qt48Xmlschema.Url;
import org.casa.dsltesting.Qt48Xmlschema.Widget;
import org.casa.dsltesting.Qt48Xmlschema.WidgetData;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage
 * @generated
 */
public class Qt48XmlschemaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Qt48XmlschemaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlschemaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Qt48XmlschemaPackage.eINSTANCE;
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
	protected Qt48XmlschemaSwitch<Adapter> modelSwitch =
		new Qt48XmlschemaSwitch<Adapter>() {
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
			public Adapter caseString(org.casa.dsltesting.Qt48Xmlschema.String object) {
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
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ActionGroup
	 * @generated
	 */
	public Adapter createActionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ActionRef <em>Action Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ActionRef
	 * @generated
	 */
	public Adapter createActionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Brush <em>Brush</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Brush
	 * @generated
	 */
	public Adapter createBrushAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ButtonGroup <em>Button Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ButtonGroup
	 * @generated
	 */
	public Adapter createButtonGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ButtonGroups <em>Button Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ButtonGroups
	 * @generated
	 */
	public Adapter createButtonGroupsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Char
	 * @generated
	 */
	public Adapter createCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ColorGroup <em>Color Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ColorGroup
	 * @generated
	 */
	public Adapter createColorGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ColorRole <em>Color Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ColorRole
	 * @generated
	 */
	public Adapter createColorRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ConnectionHint <em>Connection Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ConnectionHint
	 * @generated
	 */
	public Adapter createConnectionHintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ConnectionHints <em>Connection Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ConnectionHints
	 * @generated
	 */
	public Adapter createConnectionHintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Connections
	 * @generated
	 */
	public Adapter createConnectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.CustomWidget <em>Custom Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.CustomWidget
	 * @generated
	 */
	public Adapter createCustomWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.CustomWidgets <em>Custom Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.CustomWidgets
	 * @generated
	 */
	public Adapter createCustomWidgetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.DesignerData <em>Designer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.DesignerData
	 * @generated
	 */
	public Adapter createDesignerDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Font
	 * @generated
	 */
	public Adapter createFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Gradient
	 * @generated
	 */
	public Adapter createGradientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.GradientStop <em>Gradient Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.GradientStop
	 * @generated
	 */
	public Adapter createGradientStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ImageData
	 * @generated
	 */
	public Adapter createImageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Images <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Images
	 * @generated
	 */
	public Adapter createImagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Includes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Includes
	 * @generated
	 */
	public Adapter createIncludesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.LayoutDefault <em>Layout Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.LayoutDefault
	 * @generated
	 */
	public Adapter createLayoutDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.LayoutFunction <em>Layout Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.LayoutFunction
	 * @generated
	 */
	public Adapter createLayoutFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.LayoutItem <em>Layout Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.LayoutItem
	 * @generated
	 */
	public Adapter createLayoutItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Locale
	 * @generated
	 */
	public Adapter createLocaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Palette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Palette
	 * @generated
	 */
	public Adapter createPaletteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.PointF <em>Point F</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.PointF
	 * @generated
	 */
	public Adapter createPointFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.PropertyData <em>Property Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.PropertyData
	 * @generated
	 */
	public Adapter createPropertyDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.PropertySpecifications <em>Property Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.PropertySpecifications
	 * @generated
	 */
	public Adapter createPropertySpecificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Rect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Rect
	 * @generated
	 */
	public Adapter createRectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.RectF <em>Rect F</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.RectF
	 * @generated
	 */
	public Adapter createRectFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ResourceIcon <em>Resource Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ResourceIcon
	 * @generated
	 */
	public Adapter createResourceIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.ResourcePixmap <em>Resource Pixmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.ResourcePixmap
	 * @generated
	 */
	public Adapter createResourcePixmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Resources
	 * @generated
	 */
	public Adapter createResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.SizeF <em>Size F</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.SizeF
	 * @generated
	 */
	public Adapter createSizeFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.SizePolicy <em>Size Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.SizePolicy
	 * @generated
	 */
	public Adapter createSizePolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.SizePolicyData <em>Size Policy Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.SizePolicyData
	 * @generated
	 */
	public Adapter createSizePolicyDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Slots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Slots
	 * @generated
	 */
	public Adapter createSlotsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Spacer <em>Spacer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Spacer
	 * @generated
	 */
	public Adapter createSpacerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.StringList <em>String List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.StringList
	 * @generated
	 */
	public Adapter createStringListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.StringPropertySpecification <em>String Property Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.StringPropertySpecification
	 * @generated
	 */
	public Adapter createStringPropertySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.TabStops <em>Tab Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.TabStops
	 * @generated
	 */
	public Adapter createTabStopsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.UI
	 * @generated
	 */
	public Adapter createUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Url
	 * @generated
	 */
	public Adapter createUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.casa.dsltesting.Qt48Xmlschema.WidgetData <em>Widget Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.casa.dsltesting.Qt48Xmlschema.WidgetData
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

} //Qt48XmlschemaAdapterFactory
