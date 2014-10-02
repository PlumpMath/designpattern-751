package tdk1;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.List;

public class Temp1 extends ViewPart {

	public static final String ID = "tdk1.Temp1"; //$NON-NLS-1$

	public Temp1() {
	}

	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		
		Composite composite = new Composite(container, SWT.NONE);
		composite.setBounds(10, 10, 974, 448);
		
		Label lblSadassasdSdvfsdBdfdvb = new Label(composite, SWT.BORDER);
		lblSadassasdSdvfsdBdfdvb.setBounds(10, 10, 411, 15);
		lblSadassasdSdvfsdBdfdvb.setText("sadassasd sdvfsd bdfdvb dsdsd");
		
		Button btnBrowse = new Button(composite, SWT.NONE);
		btnBrowse.setBounds(477, 0, 75, 25);
		btnBrowse.setText("Browse");
		
		List list = new List(composite, SWT.BORDER);
		list.setBounds(10, 96, 411, 229);
		
		Button btnDelete = new Button(composite, SWT.NONE);
		btnDelete.setBounds(477, 186, 75, 25);
		btnDelete.setText("Delete");
		
		Button btnUpload = new Button(composite, SWT.NONE);
		btnUpload.setBounds(477, 293, 75, 25);
		btnUpload.setText("Upload");

		createActions();
		initializeToolBar();
		initializeMenu();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager toolbarManager = getViewSite().getActionBars()
				.getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager menuManager = getViewSite().getActionBars()
				.getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}
}
