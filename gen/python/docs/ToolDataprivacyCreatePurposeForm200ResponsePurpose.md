# ToolDataprivacyCreatePurposeForm200ResponsePurpose


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The purpose description. | [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**formattedlawfulbases** | [**List[ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner]**](ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md) |  | 
**formattedretentionperiod** | **str** | formattedretentionperiod | [default to 'null']
**formattedsensitivedatareasons** | [**List[ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner]**](ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md) |  | [optional] 
**id** | **int** | id | [default to 0]
**lawfulbases** | **str** | Comma-separated IDs matching records in tool_dataprivacy_lawfulbasis. | [default to 'null']
**name** | **str** | The purpose name. | [default to 'null']
**protected** | **int** | Data retention with higher precedent over user&#39;s request to be forgotten. | [default to 0]
**retentionperiod** | **str** | Retention period. ISO_8601 durations format (as in DateInterval format). | [default to '']
**roleoverrides** | **str** | roleoverrides | [default to 'null']
**sensitivedatareasons** | **str** | Comma-separated IDs matching records in tool_dataprivacy_sensitive | [default to '']
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.tool_dataprivacy_create_purpose_form200_response_purpose import ToolDataprivacyCreatePurposeForm200ResponsePurpose

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyCreatePurposeForm200ResponsePurpose from a JSON string
tool_dataprivacy_create_purpose_form200_response_purpose_instance = ToolDataprivacyCreatePurposeForm200ResponsePurpose.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyCreatePurposeForm200ResponsePurpose.to_json())

# convert the object into a dict
tool_dataprivacy_create_purpose_form200_response_purpose_dict = tool_dataprivacy_create_purpose_form200_response_purpose_instance.to_dict()
# create an instance of ToolDataprivacyCreatePurposeForm200ResponsePurpose from a dict
tool_dataprivacy_create_purpose_form200_response_purpose_from_dict = ToolDataprivacyCreatePurposeForm200ResponsePurpose.from_dict(tool_dataprivacy_create_purpose_form200_response_purpose_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


