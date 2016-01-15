package com.gollum.core.common.resources.data;

import com.google.gson.JsonDeserializer;

public interface MetadataSectionSerializer extends JsonDeserializer {
	/**
	 * The name of this section type as it appears in JSON.
	 */
	String getSectionName();
}