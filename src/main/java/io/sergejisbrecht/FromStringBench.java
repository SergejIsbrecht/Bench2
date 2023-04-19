package io.sergejisbrecht;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class FromStringBench {

  @Benchmark
  @OutputTimeUnit(TimeUnit.NANOSECONDS)
  @BenchmarkMode(Mode.AverageTime)
  public void valueOfException(Blackhole blackhole) throws Exception {
    EnumPrev value;
    try {
      value = EnumPrev.valueOf("ENUM^VALUE^1");
    } catch (Exception ex) {
      value = null;
    }
    blackhole.consume(value);
  }

  @Benchmark
  @OutputTimeUnit(TimeUnit.NANOSECONDS)
  @BenchmarkMode(Mode.AverageTime)
  public void valueOf(Blackhole blackhole) throws Exception {
    EnumPrev value;
    try {
      value = EnumPrev.valueOf("ENUM_VALUE_1");
    } catch (Exception ex) {
      value = null;
    }
    blackhole.consume(value);
  }
}
