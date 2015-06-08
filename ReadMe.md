**********Cordova : Add contact From App***************

By using this plugin you can open native contact app and fill data and save contact.

Install this plugin using:

cordova plugin add com.jp.plugin.add_contact

Remove Plugins :

cordova plugin remove com.jp.plugin.add_contact

Put the below code in your javascript code to add contact:

add_contact.open_contact( function(success) { console.log(success); }, function(error) { console.log(error); }, name, ph_num, email_id );

Name : String format user name ph_num : Number Format user phone number email_id : String format user email_id

GitHub URL: https://github.com/jaypratapsingh/Add_Contact_To_Phone

npm url : https://www.npmjs.com/package/com.jp.plugin.add_contact
