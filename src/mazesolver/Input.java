package mazesolver;

import javax.swing.JOptionPane;

public class Input {
	
	 public int getRow() {            
	      String rowStr = JOptionPane.showInputDialog("Enter number of rows needed :");   // Read input String from dialog box
	      Integer row = Integer.parseInt(rowStr);   
	      
	      return row;
	        }
	   
	   public String getcells() {
		      String rowStr;
		      	      // Read input String from dialog box
		      rowStr = JOptionPane.showInputDialog("Enter cells :");
		      
		      return rowStr;
		      
		   }
		   
	   
	   
	   public int getColumn() {
		      String columnStr = JOptionPane.showInputDialog("Enter number of columns needed :");
		      Integer column = Integer.parseInt(columnStr);   // Convert String to double
		      
		      return column;
		      
		   }
	   
	   public int getStartingCell() {
		      String StartingCellStr = JOptionPane.showInputDialog("Enter the starting cell :");
		      Integer StartingCell = Integer.parseInt(StartingCellStr);   // Convert String to double
		      
		      return StartingCell;
		      
		   }
	   public int getEndCell() {
		      String getEndCellStr = JOptionPane.showInputDialog("Enter the ending cell :");
		      Integer getEndCell = Integer.parseInt(getEndCellStr);   // Convert String to double
		      
		      return getEndCell;
		      
		   }

}
