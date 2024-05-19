# ToolMoodlenetVerifyWebfinger200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **str** | Domain to redirect the user to | [optional] [default to 'null']
**message** | **str** | Our message for the user | [default to 'null']
**result** | **bool** | Was the passed content a valid WebFinger? | [default to False]

## Example

```python
from openapi_client.models.tool_moodlenet_verify_webfinger200_response import ToolMoodlenetVerifyWebfinger200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMoodlenetVerifyWebfinger200Response from a JSON string
tool_moodlenet_verify_webfinger200_response_instance = ToolMoodlenetVerifyWebfinger200Response.from_json(json)
# print the JSON string representation of the object
print(ToolMoodlenetVerifyWebfinger200Response.to_json())

# convert the object into a dict
tool_moodlenet_verify_webfinger200_response_dict = tool_moodlenet_verify_webfinger200_response_instance.to_dict()
# create an instance of ToolMoodlenetVerifyWebfinger200Response from a dict
tool_moodlenet_verify_webfinger200_response_from_dict = ToolMoodlenetVerifyWebfinger200Response.from_dict(tool_moodlenet_verify_webfinger200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


