# # ToolDataprivacyCreatePurposeForm200ResponsePurpose

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** | The purpose description. | [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**formattedlawfulbases** | [**\OpenAPI\Client\Model\ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner[]**](ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md) |  |
**formattedretentionperiod** | **string** | formattedretentionperiod | [default to 'null']
**formattedsensitivedatareasons** | [**\OpenAPI\Client\Model\ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner[]**](ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md) |  | [optional]
**id** | **int** | id | [default to 0]
**lawfulbases** | **string** | Comma-separated IDs matching records in tool_dataprivacy_lawfulbasis. | [default to 'null']
**name** | **string** | The purpose name. | [default to 'null']
**protected** | **int** | Data retention with higher precedent over user&#39;s request to be forgotten. | [default to 0]
**retentionperiod** | **string** | Retention period. ISO_8601 durations format (as in DateInterval format). | [default to '']
**roleoverrides** | **string** | roleoverrides | [default to 'null']
**sensitivedatareasons** | **string** | Comma-separated IDs matching records in tool_dataprivacy_sensitive | [default to '']
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**usermodified** | **int** | usermodified | [default to 0]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
