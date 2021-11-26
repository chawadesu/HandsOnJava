import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;

public class addlist1 {

	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			addlist1 window = new addlist1();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(122, 106, 216, 26);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(122, 40, 216, 26);
		
		Button btnOk = new Button(shell, SWT.NONE);
		btnOk.setBounds(122, 171, 117, 40);
		btnOk.setText("OK");
		
		Label lblWord = new Label(shell, SWT.NONE);
		lblWord.setBounds(49, 53, 69, 26);
		lblWord.setText("Word");
		
		Label lblMeaning = new Label(shell, SWT.NONE);
		lblMeaning.setText("Meaning");
		lblMeaning.setBounds(49, 117, 69, 26);

	}
}
