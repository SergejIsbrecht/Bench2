package io.sergejisbrecht;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class HelloWorldOpenJdk {
  public static void main(String[] args) throws Throwable {
    Options opt = new OptionsBuilder()
        .include(FromStringBench.class.getSimpleName())
        .forks(1)
        // .jvmArgs("-XX:TieredStopAtLevel=1")
        // .jvmArgs("-XX:TieredStopAtLevel=1", "-Xlog:gc", "-Xmx10g", "-Xms10g")
        .warmupIterations(5)
        .measurementIterations(5)
        .addProfiler("gc")
        .mode(Mode.AverageTime)
        .build();
    new Runner(opt).run();
  }
}
