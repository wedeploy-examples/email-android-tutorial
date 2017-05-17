package com.wedeploy.tutorial_email_android;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.wedeploy.android.Callback;
import com.wedeploy.android.WeDeploy;
import com.wedeploy.android.auth.TokenAuthorization;
import com.wedeploy.android.transport.Response;
import com.wedeploy.tutorial_email_android.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

	private ActivityMainBinding binding;
	private WeDeploy weDeploy;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

		binding.signInButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String from = binding.from.getText().toString();
				String to = binding.to.getText().toString();
				String subject = binding.subject.getText().toString();

				if (!from.isEmpty() && !to.isEmpty() && !subject.isEmpty()) {
					sendEmail(from, to, subject);
				}
				else {
					Log.d(MainActivity.this.getClass().getSimpleName(), "You have to fill all the fields");
				}
			}
		});
	}

	private void sendEmail(String from, String to, String subject) {
		// Add the code of the tutorial below

		// -------
	}

	private void showAlert(String title, String message) {
		new AlertDialog.Builder(this)
			.setTitle(title)
			.setMessage(message)
			.setPositiveButton(android.R.string.ok, null)
			.show();
	}

}
