package tdk1;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {

	public static final String ID = "tdk1.view";

	/**
	 * The text control that's displaying the content of the email message.
	 */
//	private Text messageText;
	
	public void createPartControl(Composite parent) {
		Composite top = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		top.setLayout(layout);
		// top banner
		Composite banner = new Composite(top, SWT.NONE);
		banner.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL, GridData.VERTICAL_ALIGN_BEGINNING, true, false));
		layout = new GridLayout();
		layout.marginHeight = 5;
		layout.marginWidth = 10;
		layout.numColumns = 2;
		banner.setLayout(layout);
		
		// setup bold font
		Font boldFont = JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT);    
		
		Device device = Display.getCurrent ();
		Color red = new Color (device, 255, 0, 0);
		Color darkRedColor = device.getSystemColor(SWT.COLOR_DARK_RED);
		
		String warningTxt = "This operation is recommended not to be performed by "
				+ "the professional without having proper knowledge of this system."+
				"\nInvalid uploading of files may lead the system behave in an erratic manner.";
		Label label1 = new Label(banner,SWT.NONE);
		label1.setText(warningTxt);
		label1.setFont(boldFont);
		label1.setForeground(red);
		
		
		Composite c1 = new Composite(top,SWT.BORDER);
		c1.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		
		
		
		
//		c1.setLayout( new FormLayout());
//		c1.setBounds(10, 10, 574, 448);
		
		
		
		
//		c1.setLayoutData(new GridData(GridData.FILL_BOTH));
//		layout = new GridLayout();
//		layout.marginHeight = 5;
//		layout.marginWidth = 10;
//		layout.numColumns = 2;
//		c1.setLayout(layout);
		
		
		
//		Composite downComposite = new Composite(top,SWT.NONE);
//		downComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
//		layout = new GridLayout();
//		layout.marginHeight = 5;
//		layout.marginWidth = 10;
//		layout.numColumns = 2;
//		banner.setLayout(layout);
//		downComposite.setLayout(layout);
//		downComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		
//		label1.setLayoutData(new FormLayout());
//		label1.setBounds(10, 10, 411, 15);
//		label1.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		
		
		
		
		
		
		
		
		Label l = new Label(c1, SWT.NONE);
		l.setText("Select the files to verify and upload to the core system:");
		l.setFont(boldFont);
		l.setBounds(10, 10, 313, 15);
//		l.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false));
		
		Button browseBtn = new Button(c1,SWT.PUSH);
		browseBtn.setText("Browse");
		browseBtn.setBounds(335, 10, 50, 25);
//		browseBtn.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false));
		
		
		
		Label l2 = new Label(c1,SWT.None);
		l2.setText("Selected files ...");
		l2.setBounds(10, 60, 313, 15);
		
		
		final List filesList = new List(c1,SWT.MULTI | SWT.BORDER );
//		filesList.add("ABCD");
//		filesList.add("PQRS");
		filesList.setBounds(10, 80, 350, 125);
		
		
		browseBtn.addSelectionListener( new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				FileDialog fileDialog = new FileDialog(new Shell(),SWT.MULTI);
				if( ! (fileDialog.open() == null) ) {
					String rootPath = fileDialog.getFilterPath();
					System.out.println("Root Path ::::"+rootPath);
					String[] fileNames = fileDialog.getFileNames(); 
					
					for( String s : fileNames ) {
						System.out.println(s);
						
						filesList.add(s);
						
					}
				}
				
			}
		});
		
		
		Button deleteBtn1 = new Button(c1,SWT.PUSH);
		deleteBtn1.setText("Delete");
		deleteBtn1.setBounds(370, 120, 50, 25);
		
		deleteBtn1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				String[] ss = filesList.getSelection();
				for(String s1 : ss ) {
					filesList.remove(s1);
				}
				
			}
		});
		
		
		
//		browseBtn1.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false));
		
		
		
//		
	}

	public void setFocus() {
//		messageText.setFocus();
	}
}
