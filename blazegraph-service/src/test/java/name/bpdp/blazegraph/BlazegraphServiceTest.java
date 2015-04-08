package name.bpdp.blazegraph.test;

import io.vertx.codetrans.annotations.CodeTranslate;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestOptions;
import io.vertx.ext.unit.TestSuite;
import io.vertx.ext.unit.report.ReportOptions;

public class BlazegraphServiceTest {

	public void run() {

		TestSuite suite = TestSuite.create("Test suite for Blazegraph-service");
		suite.test("initialize", context -> {
			String s = "value";
			context.assertEquals("value", s);
		});

		suite.run(new TestOptions().addReporter(new ReportOptions().setTo("console")));

	}


}
