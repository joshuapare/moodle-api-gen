# EnrolLicenseEnrolUser200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | status: true if the user is enrolled, false otherwise | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.enrol_license_enrol_user200_response import EnrolLicenseEnrolUser200Response

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolLicenseEnrolUser200Response from a JSON string
enrol_license_enrol_user200_response_instance = EnrolLicenseEnrolUser200Response.from_json(json)
# print the JSON string representation of the object
print(EnrolLicenseEnrolUser200Response.to_json())

# convert the object into a dict
enrol_license_enrol_user200_response_dict = enrol_license_enrol_user200_response_instance.to_dict()
# create an instance of EnrolLicenseEnrolUser200Response from a dict
enrol_license_enrol_user200_response_from_dict = EnrolLicenseEnrolUser200Response.from_dict(enrol_license_enrol_user200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


