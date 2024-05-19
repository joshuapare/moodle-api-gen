

# ToolDataprivacyCreatePurposeForm200ResponsePurpose


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The purpose description. |  |
|**descriptionformat** | **Integer** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**formattedlawfulbases** | [**List&lt;ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner&gt;**](ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md) |  |  |
|**formattedretentionperiod** | **String** | formattedretentionperiod |  |
|**formattedsensitivedatareasons** | [**List&lt;ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner&gt;**](ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md) |  |  [optional] |
|**id** | **Integer** | id |  |
|**lawfulbases** | **String** | Comma-separated IDs matching records in tool_dataprivacy_lawfulbasis. |  |
|**name** | **String** | The purpose name. |  |
|**_protected** | **Integer** | Data retention with higher precedent over user&#39;s request to be forgotten. |  |
|**retentionperiod** | **String** | Retention period. ISO_8601 durations format (as in DateInterval format). |  |
|**roleoverrides** | **String** | roleoverrides |  |
|**sensitivedatareasons** | **String** | Comma-separated IDs matching records in tool_dataprivacy_sensitive |  |
|**timecreated** | **Integer** | timecreated |  |
|**timemodified** | **Integer** | timemodified |  |
|**usermodified** | **Integer** | usermodified |  |



