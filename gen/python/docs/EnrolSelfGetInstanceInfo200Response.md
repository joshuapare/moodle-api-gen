# EnrolSelfGetInstanceInfo200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | id of course | 
**enrolpassword** | **str** | password required for enrolment | [optional] 
**id** | **int** | id of course enrolment instance | 
**name** | **str** | name of enrolment plugin | 
**status** | **str** | status of enrolment plugin | 
**type** | **str** | type of enrolment plugin | 

## Example

```python
from openapi_client.models.enrol_self_get_instance_info200_response import EnrolSelfGetInstanceInfo200Response

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolSelfGetInstanceInfo200Response from a JSON string
enrol_self_get_instance_info200_response_instance = EnrolSelfGetInstanceInfo200Response.from_json(json)
# print the JSON string representation of the object
print(EnrolSelfGetInstanceInfo200Response.to_json())

# convert the object into a dict
enrol_self_get_instance_info200_response_dict = enrol_self_get_instance_info200_response_instance.to_dict()
# create an instance of EnrolSelfGetInstanceInfo200Response from a dict
enrol_self_get_instance_info200_response_from_dict = EnrolSelfGetInstanceInfo200Response.from_dict(enrol_self_get_instance_info200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


