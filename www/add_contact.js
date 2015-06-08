var add_contact = {
    open_contact: function(successCallback, errorCallback, name, ph_num, email_id) {
		cordova.exec( successCallback,
		            errorCallback,
					"Add_Contact",
					"add_contact_to_phone",
                	[{"name":name, "ph_num": ph_num, "email_id": email_id}]
					);
    }
}

module.exports = add_contact;

