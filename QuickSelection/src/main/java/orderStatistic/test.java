package orderStatistic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test {

	OrderStatisticsSelectionImpl order;
	private Integer[] array;
	@Before
	public void test() {
		order = new OrderStatisticsSelectionImpl<Integer>();
		 this.array = new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23, 31 };
	}

	@Test
    public void testGetOrderStatistics01() {
		 this.array = new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23, 31 };
        assertEquals((Integer) 4, order.getOrderStatistics(this.array, 1));
    }

}
