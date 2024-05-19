# MoodleClient.Model.ToolDataprivacyCreatePurposeForm200ResponsePurpose

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **string** | The purpose description. | [default to ""]
**Descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Formattedlawfulbases** | [**List&lt;ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner&gt;**](ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md) |  | 
**Formattedretentionperiod** | **string** | formattedretentionperiod | [default to "null"]
**Formattedsensitivedatareasons** | [**List&lt;ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner&gt;**](ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md) |  | [optional] 
**Id** | **int** | id | [default to 0]
**Lawfulbases** | **string** | Comma-separated IDs matching records in tool_dataprivacy_lawfulbasis. | [default to "null"]
**Name** | **string** | The purpose name. | [default to "null"]
**Protected** | **int** | Data retention with higher precedent over user&#39;s request to be forgotten. | [default to 0]
**Retentionperiod** | **string** | Retention period. ISO_8601 durations format (as in DateInterval format). | [default to ""]
**Roleoverrides** | **string** | roleoverrides | [default to "null"]
**Sensitivedatareasons** | **string** | Comma-separated IDs matching records in tool_dataprivacy_sensitive | [default to ""]
**Timecreated** | **int** | timecreated | [default to 0]
**Timemodified** | **int** | timemodified | [default to 0]
**Usermodified** | **int** | usermodified | [default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

