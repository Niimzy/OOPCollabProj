package com.example.switchpage;
import com.example.switchpage.Items;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private AnchorPane admin_login_form;
    @FXML
    private AnchorPane user_sidebar;
    @FXML
    private PasswordField admin_pass;
    @FXML
    private Button table_back_btn;

    @FXML
    private TextField food_name_field;
    @FXML
    private Button remove_item_btn;
    @FXML
    private TextField id_field;

    @FXML
    private Text admin_name_welcome;
    @FXML
    private TableColumn<Items, Integer> food_id;

    @FXML
    private TableColumn<Items, String> food_name;
    @FXML
    private TableColumn<Items, Double> price;
    @FXML
    private AnchorPane table_container;
    @FXML
    private TableColumn<Items, Integer> quantity;
    @FXML
    private Button additemdetail_view_btn;
    @FXML
    private TextField price_field;
    @FXML
    private Button admin_login_btn;
    @FXML
    private TextField quantity_field;
    @FXML
    private TextField admin_email;
    @FXML
    private Button admin_page_btn;
    @FXML
    private TextField login_email;
    @FXML
    private PasswordField login_password;
    @FXML
    private AnchorPane login_form;
    @FXML
    private AnchorPane admin_portal;
    @FXML
    private Button login_page_btn;
    @FXML
    private TextField signup_Adressfield;
    @FXML
    private AnchorPane signup_form;
    @FXML
    private Button table_view_btn;
    @FXML
    private Button signup_page_btn;
    @FXML
    private Button signup_btn;
    @FXML
    private Button login_btn;
    @FXML
    private Button final_add_btn;
    @FXML
    private TextField signup_email;
    @FXML
    private PasswordField signup_password;
    @FXML
    private TextField signup_username;
    @FXML
    private Button admin_logout_btn;
    @FXML
    private AnchorPane admin_sidebar;
    @FXML
    private TableView<Items> table;
    Alert alert = new Alert(Alert.AlertType.INFORMATION);


    public void switchForm(ActionEvent event) {
        if (event.getSource() == signup_page_btn) {
            signup_form.setVisible(true);
            login_form.setVisible(false);
            admin_login_form.setVisible(false);
            admin_sidebar.setVisible(false);
            admin_portal.setVisible(false);
            table_container.setVisible(false);
            user_sidebar.setVisible(true);
        } else if (event.getSource() == login_page_btn) {
            signup_form.setVisible(false);
            login_form.setVisible(true);
            admin_login_form.setVisible(false);
            admin_sidebar.setVisible(false);
            admin_portal.setVisible(false);
            table_container.setVisible(false);
            user_sidebar.setVisible(true);
        } else if (event.getSource() == admin_page_btn) {
            signup_form.setVisible(false);
            login_form.setVisible(false);
            admin_login_form.setVisible(true);
            admin_sidebar.setVisible(false);
            admin_portal.setVisible(false);
            table_container.setVisible(false);
            user_sidebar.setVisible(true);
        }
    }

    public void signup(ActionEvent event) {
        if (event.getSource() == signup_btn)
            signupValidation();

    }

    public void signupValidation() {
        if (!signup_Adressfield.getText().isEmpty() && !signup_username.getText().isEmpty() && !signup_email.getText().isEmpty() && !signup_password.getText().isEmpty()) {
            alert.setTitle("Accounted Created");
            alert.setHeaderText(null);
            alert.setContentText("welcome " + signup_username.getText());
            alert.showAndWait();
        } else {
            alert.setTitle("Enter complete details");
            alert.setHeaderText(null);
            alert.setContentText("credentials");
            alert.showAndWait();
        }
    }

    public void login(ActionEvent event) {
        if (event.getSource() == login_btn)
            loginValidation();
    }

    public void loginValidation() {

        if (login_password.getText().equals(signup_password.getText()) && login_email.getText().equals(signup_email.getText()) && !login_email.getText().isEmpty() && !login_password.getText().isEmpty()) {
            System.out.println("email adress = " + login_email.getText());
            System.out.println("password = " + login_password.getText());
            alert.setTitle("Welcome back");
            alert.setHeaderText(null);
            alert.setContentText("Welcome back user");
            alert.showAndWait();

        } else {
            alert.setTitle("enter details");
            alert.setHeaderText(null);
            alert.setContentText("invalid details");
            alert.showAndWait();
        }
    }

    public void adminLogin(ActionEvent event) {
        if (event.getSource() == admin_login_btn)
            adminLoginValidation();
    }

    public void adminLoginValidation() {
        String admin_password = "admin123";
        if (!admin_email.getText().isEmpty() && admin_pass.getText().equals(admin_password)) {
            admin_sidebar.setVisible(true);
            user_sidebar.setVisible(false);
            admin_portal.setVisible(true);
            login_form.setVisible(false);
            signup_form.setVisible(false);
            table_container.setVisible(false);
            setAdminName();
        } else {
            alert.setTitle("Failed login");
            alert.setHeaderText(null);
            alert.setContentText("Credentials not match");
            alert.showAndWait();
        }

    }

    public void setAdminName() {
        String name = admin_email.getText();
        admin_name_welcome.setText(name);
    }

    public void adminLogout(ActionEvent event) {
        if (event.getSource() == admin_logout_btn) {
            admin_sidebar.setVisible(false);
            admin_portal.setVisible(false);
            admin_login_form.setVisible(true);
            user_sidebar.setVisible(true);
            signup_form.setVisible(false);
            login_form.setVisible(false);
            admin_email.clear();
            admin_pass.clear();
            table_container.setVisible(false);
        }
    }

    public void tableView(ActionEvent event) {
        if (event.getSource() == table_view_btn) {
            user_sidebar.setVisible(false);
            admin_portal.setVisible(false);
            table_container.setVisible(true);
            login_form.setVisible(false);
            signup_form.setVisible(false);
        }
    }

    public void tableBack(ActionEvent event) {
        if (event.getSource() == table_back_btn) {
            user_sidebar.setVisible(false);
            table_container.setVisible(false);
            admin_portal.setVisible(true);
            login_form.setVisible(false);
            signup_form.setVisible(false);
            admin_login_form.setVisible(false);
            admin_sidebar.setVisible(true);
        }
    }

//ObservableList<Items> list = FXCollections.observableArrayList(
//        new Items(1,"Burgers",50.0,5),
//        new Items(2,"Cheese slice",100,100),
//        new Items(3,"Breads",150,50)
//);

    public void initialize(URL url, ResourceBundle resourceBundle) {
        food_id.setCellValueFactory(new PropertyValueFactory<Items, Integer>("food_id"));
        food_name.setCellValueFactory(new PropertyValueFactory<Items, String>("food_name"));
        price.setCellValueFactory(new PropertyValueFactory<Items, Double>("Price"));
        quantity.setCellValueFactory(new PropertyValueFactory<Items, Integer>("Quantity"));
//table.setItems(list);
    }

    public void AdditemDetailView(ActionEvent event) {
        if (event.getSource() == additemdetail_view_btn) {
            id_field.setVisible(true);
            food_name_field.setVisible(true);
            price_field.setVisible(true);
            quantity_field.setVisible(true);
            final_add_btn.setVisible(true);
        }
    }

    public void AddItems(ActionEvent event) {
        try {
            if (!id_field.getText().isEmpty() && !food_name_field.getText().isEmpty() && !price_field.getText().isEmpty() && !quantity_field.getText().isEmpty()) {
            Items items = new Items(Integer.parseInt(id_field.getText()), food_name_field.getText(), Double.parseDouble(price_field.getText()), Integer.parseInt(quantity_field.getText()));
                ObservableList<Items> itemsList = table.getItems();
                itemsList.add(items);
                table.setItems(itemsList);
                clearItemsFields();
            } else {
                alert.setTitle("Incomplete details");
                alert.setHeaderText(null);
                alert.setContentText("Enter all details");
                alert.showAndWait();
            }
        }
        catch (RuntimeException e){
            System.out.println("Incompatible !!!");
        }
    }
    public void removeItem(ActionEvent event){
        int selectedID = table.getSelectionModel().getSelectedIndex();
        try {
            table.getItems().remove(selectedID);
        table.getSelectionModel().clearSelection();
        }
        catch (RuntimeException e){
            System.out.println("please selet item which you want to remove!!!");
        }

         }

         // to clear fields after add
         public void clearItemsFields(){
        price_field.clear();
        id_field.clear();
        food_name_field.clear();
        quantity_field.clear();
         }

         // to update items
public  void rowClicked(MouseEvent event){

        Items selectedItem = table.getSelectionModel().getSelectedItem();
        id_field.setText(String.valueOf(selectedItem.getFood_id()));
        food_name_field.setText(String.valueOf(selectedItem.getFood_name()));
        price_field.setText(String.valueOf(selectedItem.getPrice()));
        quantity_field.setText(String.valueOf(selectedItem.getQuantity()));

}

    public void updateItems(ActionEvent event) {
        try {
            ObservableList<Items> itemsList = table.getItems();
            int selectedID = Integer.parseInt(id_field.getText());

            for (Items item : itemsList) {
                if (item.getFood_id() == selectedID) {
                    // Validate and update fields
                    int newFoodId = Integer.parseInt(food_id.getText());
                    String newFoodName = String.valueOf(food_name_field.getText());
                    double newPrice = Double.parseDouble(price_field.getText());
                    int newQuantity = Integer.parseInt(quantity_field.getText());

                    // Update the item
                    item.setFood_id(newFoodId);
                    item.setFood_name(newFoodName);
                    item.setPrice(newPrice);
                    item.setQuantity(newQuantity);

                    // Refresh the TableView (if needed)
                    // table.refresh();  // This might not be necessary

                    break; // Break the loop after updating the first matching item
                }
            }
            // Refresh the TableView (if needed)
            table.setItems(itemsList);
        } catch (NumberFormatException e) {
            // Handle the exception (e.g., show an alert to the user)
            showAlert("Invalid Input", "Please enter valid numbers for ID, Price, and Quantity");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }


}
