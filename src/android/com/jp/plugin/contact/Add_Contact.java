package com.jp.plugin.contact;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONObject;

import android.content.Intent;
import android.provider.ContactsContract;


public class Add_Contact extends CordovaPlugin {

	public boolean execute(String args, JSONArray jsonarray, CallbackContext callbackContext )
	{
		if(args.equalsIgnoreCase("add_contact_to_phone")) {

			try {
				JSONObject jsonObject = jsonarray.getJSONObject(0);

				String name = jsonObject.getString("name");
				String phone_number = jsonObject.getString("ph_num");
				String email_id = jsonObject.getString("email_id");

				Intent intent = new Intent(Intent.ACTION_INSERT);
			    	intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
			    	intent.putExtra(ContactsContract.Intents.Insert.NAME, name);
			    	intent.putExtra(ContactsContract.Intents.Insert.PHONE, phone_number);
			    	intent.putExtra(ContactsContract.Intents.Insert.EMAIL, email_id);
			    	cordova.getActivity().startActivity(intent);

            		}
			catch(Exception e) {
				e.printStackTrace();
			}

        	callbackContext.success("success");
            	return true;
		}
		else  {
			callbackContext.error("Invalid Selection");
			return false;
		}


	}

}
