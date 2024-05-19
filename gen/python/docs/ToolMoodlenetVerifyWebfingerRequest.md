# ToolMoodlenetVerifyWebfingerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | **int** | The course we are adding to | [default to null]
**profileurl** | **str** | The profile url that the user has given us | [default to 'null']
**section** | **int** | The section within the course we are adding to | [default to null]

## Example

```python
from openapi_client.models.tool_moodlenet_verify_webfinger_request import ToolMoodlenetVerifyWebfingerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMoodlenetVerifyWebfingerRequest from a JSON string
tool_moodlenet_verify_webfinger_request_instance = ToolMoodlenetVerifyWebfingerRequest.from_json(json)
# print the JSON string representation of the object
print(ToolMoodlenetVerifyWebfingerRequest.to_json())

# convert the object into a dict
tool_moodlenet_verify_webfinger_request_dict = tool_moodlenet_verify_webfinger_request_instance.to_dict()
# create an instance of ToolMoodlenetVerifyWebfingerRequest from a dict
tool_moodlenet_verify_webfinger_request_from_dict = ToolMoodlenetVerifyWebfingerRequest.from_dict(tool_moodlenet_verify_webfinger_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


