package com.example.jcalculator;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

@SuppressLint("CutPasteId")
public class MainActivity extends Activity {

	float answer = 0, ianswer;
	Button add, sub, mul, one, two, thr, fou, fiv, six, sev, eig, nin, zer,
			del, equal, reset, div, point, special;
	float num1 = 0;
	float num2 = 0;
	int flag = 0, ip = 0;
	double pointcounter = 0;
	TextView disp, idisp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		disp = (TextView) findViewById(R.id.ans);
		idisp = (TextView) findViewById(R.id.ians);
		add = (Button) findViewById(R.id.add);
		sub = (Button) findViewById(R.id.sub);
		mul = (Button) findViewById(R.id.mul);
		div = (Button) findViewById(R.id.div);
		reset = (Button) findViewById(R.id.reset);
		one = (Button) findViewById(R.id.one);
		two = (Button) findViewById(R.id.two);
		thr = (Button) findViewById(R.id.thr);
		fou = (Button) findViewById(R.id.fou);
		fiv = (Button) findViewById(R.id.fiv);
		six = (Button) findViewById(R.id.six);
		sev = (Button) findViewById(R.id.sev);
		eig = (Button) findViewById(R.id.eig);
		nin = (Button) findViewById(R.id.nin);
		zer = (Button) findViewById(R.id.zer);
		equal = (Button) findViewById(R.id.equ);
		point = (Button) findViewById(R.id.point);
		del = (Button) findViewById(R.id.del);
	
		try {

			point.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (ip == 0) {
						ip = 1;
						pointcounter--;
						
					}
				}
			});
            
			del.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub

					if (flag == 0) {
						if (ip == 0) {
							int a = (int) (num1 / 10);
							num1 = a;
						} else {
							num1 = (float) (num1 * Math.pow(10,
									pointcounter - 1));
							int a = (int) num1 / 10;
							num1 = a;

						}
						disp.setText("" + num1);
						idisp.setText("" + num1);
						ianswer = (float) num1;

					} else {
						if (num2 == 0) {
							flag = 0;
							disp.setText("" + num1);

						} else {
							if (ip == 0) {
								int a = (int) (num2 / 10);
								num2 = a;
							} else {

								num2 = (float) (num2 * Math.pow(10,
										pointcounter - 1));
								int a = (int) num2 / 10;
								num2 = a;

							}
							switch (flag) {
							case 1:
								disp.setText(num1 + "-" + num2);
								break;
							case 2:
								disp.setText(num1 + "*" + num2);
								break;
							case 3:
								disp.setText(num1 + "+" + num2);
								break;
							case 4:
								disp.setText(num1 + "/" + num2);
								break;
							}
							switch (flag) {
							case 1:
								ianswer = (float) (num1 - num2);
								break;
							case 2:
								ianswer = (float) (num1 * num2);
								break;
							case 3:
								ianswer = (float) (num1 + num2);
								break;
							case 4:
								ianswer = (float) (num1 / num2);
								break;

							}
							idisp.setText("" + ianswer);
						}
					}

				}
			});

			one.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub

					if (flag == 0) {
						if (ip == 1) {

							num1 = (float) (num1 + Math.pow(10, pointcounter) * 1);
							pointcounter--;

						} else {
							num1 = (num1 * 10) + 1;
						}
						disp.setText("" + num1);
						idisp.setText("" + num1);
						ianswer = (float) num1;
					} else {

						if (ip == 1) {

							num2 = (float) (num2 + Math.pow(10, pointcounter) * 1);

							pointcounter--;

						} else {
							num2 = num2 * 10 + 1;
						}
						switch (flag) {
						case 1:
							disp.setText(num1 + "-" + num2);
							break;
						case 2:
							disp.setText(num1 + "*" + num2);
							break;
						case 3:
							disp.setText(num1 + "+" + num2);
							break;
						case 4:
							disp.setText(num1 + "/" + num2);
							break;
						}
						switch (flag) {
						case 1:
							ianswer = (float) (num1 - num2);
							break;
						case 2:
							ianswer = (float) (num1 * num2);
							break;
						case 3:
							ianswer = (float) (num1 + num2);
							break;
						case 4:
							ianswer = (float) (num1 / num2);
							break;

						}
						idisp.setText("" + ianswer);
					}
				}
			});
			two.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (flag == 0) {
						if (ip == 1) {

							num1 = (float) (num1 + Math.pow(10, pointcounter) * 2);
							pointcounter--;

						} else {
							num1 = (num1 * 10) + 2;
						}
						disp.setText("" + num1);
						idisp.setText("" + num1);
						ianswer = (float) num1;
					} else {
						if (ip == 1) {

							num2 = (float) (num2 + Math.pow(10, pointcounter) * 2);
							pointcounter--;

						} else {
							num2 = num2 * 10 + 2;
						}
						switch (flag) {
						case 1:
							disp.setText(num1 + "-" + num2);
							break;
						case 2:
							disp.setText(num1 + "*" + num2);
							break;
						case 3:
							disp.setText(num1 + "+" + num2);
							break;
						case 4:
							disp.setText(num1 + "/" + num2);
							break;
						}
						switch (flag) {
						case 1:
							ianswer = (float) (num1 - num2);
							break;
						case 2:
							ianswer = (float) (num1 * num2);
							break;
						case 3:
							ianswer = (float) (num1 + num2);
							break;
						case 4:
							ianswer = (float) (num1 / num2);
							break;

						}
						idisp.setText("" + ianswer);
					}

				}
			});
			thr.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (flag == 0) {
						if (ip == 1) {

							num1 = (float) (num1 + Math.pow(10, pointcounter) * 3);
							pointcounter--;

						} else {
							num1 = (num1 * 10) + 3;
						}
						disp.setText("" + num1);
						idisp.setText("" + num1);
						ianswer = (float) num1;
					} else {
						if (ip == 1) {

							num2 = (float) (num2 + Math.pow(10, pointcounter) * 3);
							pointcounter--;

						} else {
							num2 = num2 * 10 + 3;
						}
						switch (flag) {
						case 1:
							disp.setText(num1 + "-" + num2);
							break;
						case 2:
							disp.setText(num1 + "*" + num2);
							break;
						case 3:
							disp.setText(num1 + "+" + num2);
							break;
						case 4:
							disp.setText(num1 + "/" + num2);
							break;
						}
						switch (flag) {
						case 1:
							ianswer = (float) (num1 - num2);
							break;
						case 2:
							ianswer = (float) (num1 * num2);
							break;
						case 3:
							ianswer = (float) (num1 + num2);
							break;
						case 4:
							ianswer = (float) (num1 / num2);
							break;

						}
						idisp.setText("" + ianswer);
					}

				}
			});
			fou.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (flag == 0) {
						if (ip == 1) {

							num1 = (float) (num1 + Math.pow(10, pointcounter) * 4);
							pointcounter--;

						} else {
							num1 = (num1 * 10) + 4;
						}
						idisp.setText("" + num1);
						ianswer = (float) num1;
						disp.setText("" + num1);
					} else {
						if (ip == 1) {

							num2 = (float) (num2 + Math.pow(10, pointcounter) * 4);
							pointcounter--;

						} else {
							num2 = num2 * 10 + 4;
						}
						switch (flag) {
						case 1:
							disp.setText(num1 + "-" + num2);
							break;
						case 2:
							disp.setText(num1 + "*" + num2);
							break;
						case 3:
							disp.setText(num1 + "+" + num2);
							break;
						case 4:
							disp.setText(num1 + "/" + num2);
							break;
						}
						switch (flag) {
						case 1:
							ianswer = (float) (num1 - num2);
							break;
						case 2:
							ianswer = (float) (num1 * num2);
							break;
						case 3:
							ianswer = (float) (num1 + num2);
							break;
						case 4:
							ianswer = (float) (num1 / num2);
							break;

						}
						idisp.setText("" + ianswer);
					}

				}
			});
			fiv.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (flag == 0) {
						if (ip == 1) {

							num1 = (float) (num1 + Math.pow(10, pointcounter) * 5);
							pointcounter--;

						} else {
							num1 = (num1 * 10) + 5;
						}
						disp.setText("" + num1);
						idisp.setText("" + num1);
						ianswer = (float) num1;
					} else {
						if (ip == 1) {

							num2 = (float) (num2 + Math.pow(10, pointcounter) * 5);
							pointcounter--;

						} else {
							num2 = num2 * 10 + 5;
						}
						switch (flag) {
						case 1:
							disp.setText(num1 + "-" + num2);
							break;
						case 2:
							disp.setText(num1 + "*" + num2);
							break;
						case 3:
							disp.setText(num1 + "+" + num2);
							break;
						case 4:
							disp.setText(num1 + "/" + num2);
							break;
						}
						switch (flag) {
						case 1:
							ianswer = (float) (num1 - num2);
							break;
						case 2:
							ianswer = (float) (num1 * num2);
							break;
						case 3:
							ianswer = (float) (num1 + num2);
							break;
						case 4:
							ianswer = (float) (num1 / num2);
							break;

						}
						idisp.setText("" + ianswer);
					}

				}
			});
			six.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (flag == 0) {
						if (ip == 1) {

							num1 = (float) (num1 + Math.pow(10, pointcounter) * 6);
							pointcounter--;

						} else {
							num1 = (num1 * 10) + 6;
						}
						disp.setText("" + num1);
						idisp.setText("" + num1);
						ianswer = (float) num1;
					} else {
						if (ip == 1) {

							num2 = (float) (num2 + Math.pow(10, pointcounter) * 6);
							pointcounter--;

						} else {
							num2 = num2 * 10 + 6;
						}
						switch (flag) {
						case 1:
							disp.setText(num1 + "-" + num2);
							break;
						case 2:
							disp.setText(num1 + "*" + num2);
							break;
						case 3:
							disp.setText(num1 + "+" + num2);
							break;
						case 4:
							disp.setText(num1 + "/" + num2);
							break;
						}
						switch (flag) {
						case 1:
							ianswer = (float) (num1 - num2);
							break;
						case 2:
							ianswer = (float) (num1 * num2);
							break;
						case 3:
							ianswer = (float) (num1 + num2);
							break;
						case 4:
							ianswer = (float) (num1 / num2);
							break;

						}
						idisp.setText("" + ianswer);
					}

				}
			});
			sev.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (flag == 0) {
						if (ip == 1) {

							num1 = (float) (num1 + Math.pow(10, pointcounter) * 7);
							pointcounter--;

						} else {
							num1 = (num1 * 10) + 7;
						}
						disp.setText("" + num1);
						idisp.setText("" + num1);
						ianswer = (float) num1;
					} else {
						if (ip == 1) {

							num2 = (float) (num2 + Math.pow(10, pointcounter) * 7);
							pointcounter--;

						} else {
							num2 = num2 * 10 + 7;
						}
						switch (flag) {
						case 1:
							disp.setText(num1 + "-" + num2);
							break;
						case 2:
							disp.setText(num1 + "*" + num2);
							break;
						case 3:
							disp.setText(num1 + "+" + num2);
							break;
						case 4:
							disp.setText(num1 + "/" + num2);
							break;
						}
						switch (flag) {
						case 1:
							ianswer = (float) (num1 - num2);
							break;
						case 2:
							ianswer = (float) (num1 * num2);
							break;
						case 3:
							ianswer = (float) (num1 + num2);
							break;
						case 4:
							ianswer = (float) (num1 / num2);
							break;

						}
						idisp.setText("" + ianswer);
					}

				}
			});
			eig.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (flag == 0) {
						if (ip == 1) {

							num1 = (float) (num1 + Math.pow(10, pointcounter) * 8);
							pointcounter--;

						} else {
							num1 = (num1 * 10) + 8;
						}
						disp.setText("" + num1);
						idisp.setText("" + num1);
						ianswer = (float) num1;
					} else {
						if (ip == 1) {

							num2 = (float) (num2 + Math.pow(10, pointcounter) * 8);
							pointcounter--;

						} else {
							num2 = num2 * 10 + 8;
						}
						switch (flag) {
						case 1:
							disp.setText(num1 + "-" + num2);
							break;
						case 2:
							disp.setText(num1 + "*" + num2);
							break;
						case 3:
							disp.setText(num1 + "+" + num2);
							break;
						case 4:
							disp.setText(num1 + "/" + num2);
							break;
						}
						switch (flag) {
						case 1:
							ianswer = (float) (num1 - num2);
							break;
						case 2:
							ianswer = (float) (num1 * num2);
							break;
						case 3:
							ianswer = (float) (num1 + num2);
							break;
						case 4:
							ianswer = (float) (num1 / num2);
							break;

						}
						idisp.setText("" + ianswer);
					}

				}
			});
			nin.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (flag == 0) {
						if (ip == 1) {

							num1 = (float) (num1 + Math.pow(10, pointcounter) * 9);
							pointcounter--;

						} else {
							num1 = (num1 * 10) + 9;
						}
						disp.setText("" + num1);
						idisp.setText("" + num1);
						ianswer = (float) num1;
					} else {
						if (ip == 1) {

							num2 = (float) (num2 + Math.pow(10, pointcounter) * 9);
							pointcounter--;

						} else {
							num2 = num2 * 10 + 9;
						}
						switch (flag) {
						case 1:
							disp.setText(num1 + "-" + num2);
							break;
						case 2:
							disp.setText(num1 + "*" + num2);
							break;
						case 3:
							disp.setText(num1 + "+" + num2);
							break;
						case 4:
							disp.setText(num1 + "/" + num2);
							break;
						}
						switch (flag) {
						case 1:
							ianswer = (float) (num1 - num2);
							break;
						case 2:
							ianswer = (float) (num1 * num2);
							break;
						case 3:
							ianswer = (float) (num1 + num2);
							break;
						case 4:
							ianswer = (float) (num1 / num2);
							break;

						}
						idisp.setText("" + ianswer);

					}

				}
			});
			zer.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if (flag == 0) {
						if (ip == 1) {

							num1 = (float) (num1 + Math.pow(10, pointcounter) * 0);
							pointcounter--;

						} else {
							num1 = (num1 * 10) + 0;
						}
						disp.setText("" + num1);
						idisp.setText("" + num1);
						ianswer = (float) num1;
					} else {
						if (ip == 1) {

							num2 = (float) (num2 + Math.pow(10, pointcounter) * 0);
							pointcounter--;

						} else {
							num2 = num2 * 10 + 0;
						}
						switch (flag) {
						case 1:
							disp.setText(num1 + "-" + num2);
							break;
						case 2:
							disp.setText(num1 + "*" + num2);
							break;
						case 3:
							disp.setText(num1 + "+" + num2);
							break;
						case 4:
							disp.setText(num1 + "/" + num2);
							break;
						}
						switch (flag) {
						case 1:
							ianswer = (float) (num1 - num2);
							break;
						case 2:
							ianswer = (float) (num1 * num2);
							break;
						case 3:
							ianswer = (float) (num1 + num2);
							break;
						case 4:
							ianswer = (float) (num1 / num2);
							break;

						}
						idisp.setText("" + ianswer);
					}

				}
			});

			add.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub

					num1 = ianswer;
					flag = 3;
					disp.setText(num1 + "+");
					num2 = 0;
					ip = 0;
					pointcounter = 0;

				}
			});
			sub.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub

					flag = 1;
					num1 = ianswer;
					disp.setText(num1 + "-");
					num2 = 0;
					ip = 0;
					pointcounter = 0;

				}
			});
			mul.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub

					flag = 2;
					num1 = ianswer;
					num2 = 0;
					disp.setText(num1 + "*");
					ip = 0;
					pointcounter = 0;

				}
			});
			div.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub

					flag = 4;
					num1 = ianswer;
					disp.setText(num1 + "/");
					num2 = 0;
					ip = 0;
					pointcounter = 0;

				}
			});
			reset.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub

					flag = 5;
					disp.setText(" ");
					answer = 0;
					idisp.setText(" ");
					ianswer = 0;
					num1 = num2 = flag = 0;
					ip = 0;
					pointcounter = 0;
				}
			});
			equal.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					switch (flag) {
					case 1:
						answer = (float) (num1 - num2);
						break;
					case 2:
						answer = (float) (num1 * num2);
						break;
					case 3:
						answer = (float) (num1 + num2);
						break;
					case 4:
						answer = (float) (num1 / num2);
						break;

					}
					// disp.setText("1,2="+num1+" "+num2) ;
					disp.setText("" + answer);
					num1 = answer;
					num2 = 0;
					flag = 0;
					ip = 0;
					pointcounter = 0;
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
