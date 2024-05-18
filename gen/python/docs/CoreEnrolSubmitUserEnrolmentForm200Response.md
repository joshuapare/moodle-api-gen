# CoreEnrolSubmitUserEnrolmentForm200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **bool** | True if the user&#39;s enrolment was successfully updated | [default to False]
**validationerror** | **bool** | Indicates invalid form data | [optional] [default to False]

## Example

```python
from openapi_client.models.core_enrol_submit_user_enrolment_form200_response import CoreEnrolSubmitUserEnrolmentForm200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreEnrolSubmitUserEnrolmentForm200Response from a JSON string
core_enrol_submit_user_enrolment_form200_response_instance = CoreEnrolSubmitUserEnrolmentForm200Response.from_json(json)
# print the JSON string representation of the object
print(CoreEnrolSubmitUserEnrolmentForm200Response.to_json())

# convert the object into a dict
core_enrol_submit_user_enrolment_form200_response_dict = core_enrol_submit_user_enrolment_form200_response_instance.to_dict()
# create an instance of CoreEnrolSubmitUserEnrolmentForm200Response from a dict
core_enrol_submit_user_enrolment_form200_response_from_dict = CoreEnrolSubmitUserEnrolmentForm200Response.from_dict(core_enrol_submit_user_enrolment_form200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


