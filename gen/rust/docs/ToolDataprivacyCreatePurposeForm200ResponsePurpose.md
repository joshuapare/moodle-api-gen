# ToolDataprivacyCreatePurposeForm200ResponsePurpose

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The purpose description. | [default to ]
**descriptionformat** | Option<**i32**> | description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**formattedlawfulbases** | [**Vec<models::ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner>**](tool_dataprivacy_create_purpose_form_200_response_purpose_formattedlawfulbases_inner.md) |  | 
**formattedretentionperiod** | **String** | formattedretentionperiod | [default to null]
**formattedsensitivedatareasons** | Option<[**Vec<models::ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner>**](tool_dataprivacy_create_purpose_form_200_response_purpose_formattedlawfulbases_inner.md)> |  | [optional]
**id** | **i32** | id | [default to 0]
**lawfulbases** | **String** | Comma-separated IDs matching records in tool_dataprivacy_lawfulbasis. | [default to null]
**name** | **String** | The purpose name. | [default to null]
**protected** | **i32** | Data retention with higher precedent over user's request to be forgotten. | [default to 0]
**retentionperiod** | **String** | Retention period. ISO_8601 durations format (as in DateInterval format). | [default to ]
**roleoverrides** | **String** | roleoverrides | [default to null]
**sensitivedatareasons** | **String** | Comma-separated IDs matching records in tool_dataprivacy_sensitive | [default to ]
**timecreated** | **i32** | timecreated | [default to 0]
**timemodified** | **i32** | timemodified | [default to 0]
**usermodified** | **i32** | usermodified | [default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


