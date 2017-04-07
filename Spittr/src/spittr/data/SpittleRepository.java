package spittr.data;

import java.util.*;

import spittr.domain.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
}
