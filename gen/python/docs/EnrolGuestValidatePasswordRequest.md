# EnrolGuestValidatePasswordRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceid** | **int** | instance id of guest enrolment plugin | [default to null]
**password** | **str** | the course password | [default to 'null']

## Example

```python
from openapi_client.models.enrol_guest_validate_password_request import EnrolGuestValidatePasswordRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolGuestValidatePasswordRequest from a JSON string
enrol_guest_validate_password_request_instance = EnrolGuestValidatePasswordRequest.from_json(json)
# print the JSON string representation of the object
print(EnrolGuestValidatePasswordRequest.to_json())

# convert the object into a dict
enrol_guest_validate_password_request_dict = enrol_guest_validate_password_request_instance.to_dict()
# create an instance of EnrolGuestValidatePasswordRequest from a dict
enrol_guest_validate_password_request_from_dict = EnrolGuestValidatePasswordRequest.from_dict(enrol_guest_validate_password_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


