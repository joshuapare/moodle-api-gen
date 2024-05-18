# CoreMoodlenetGetShareInfoActivity200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuerid** | **int** | MoodleNet issuer id | [default to null]
**name** | **str** | Activity name | [default to 'null']
**server** | **str** | MoodleNet server | [default to 'null']
**status** | **bool** | status: true if success | 
**supportpageurl** | **str** | Support page URL | [default to 'null']
**type** | **str** | Activity type | [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_moodlenet_get_share_info_activity200_response import CoreMoodlenetGetShareInfoActivity200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMoodlenetGetShareInfoActivity200Response from a JSON string
core_moodlenet_get_share_info_activity200_response_instance = CoreMoodlenetGetShareInfoActivity200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMoodlenetGetShareInfoActivity200Response.to_json())

# convert the object into a dict
core_moodlenet_get_share_info_activity200_response_dict = core_moodlenet_get_share_info_activity200_response_instance.to_dict()
# create an instance of CoreMoodlenetGetShareInfoActivity200Response from a dict
core_moodlenet_get_share_info_activity200_response_from_dict = CoreMoodlenetGetShareInfoActivity200Response.from_dict(core_moodlenet_get_share_info_activity200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


