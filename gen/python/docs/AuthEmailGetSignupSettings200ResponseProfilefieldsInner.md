# AuthEmailGetSignupSettings200ResponseProfilefieldsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | Profield field category id | [optional] [default to null]
**categoryname** | **str** | Profield field category name | [optional] [default to 'null']
**datatype** | **str** | Profield field datatype | [optional] [default to 'null']
**defaultdata** | **str** | Profield field default data | [optional] [default to 'null']
**defaultdataformat** | **int** | defaultdata format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**description** | **str** | Profield field description | [optional] [default to 'null']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**forceunique** | **int** | Profield field unique | [optional] [default to null]
**id** | **int** | Profile field id | [optional] [default to null]
**locked** | **int** | Profield field locked | [optional] [default to null]
**name** | **str** | Profield field name | [optional] [default to 'null']
**param1** | **str** | Profield field settings | [optional] [default to 'null']
**param2** | **str** | Profield field settings | [optional] 
**param3** | **str** | Profield field settings | [optional] 
**param4** | **str** | Profield field settings | [optional] 
**param5** | **str** | Profield field settings | [optional] 
**required** | **int** | Profield field required | [optional] [default to null]
**shortname** | **str** | Profile field shortname | [optional] [default to 'null']
**signup** | **int** | Profield field in signup form | [optional] [default to null]
**sortorder** | **int** | Profield field sort order | [optional] [default to null]
**visible** | **int** | Profield field visible | [optional] [default to null]

## Example

```python
from openapi_client.models.auth_email_get_signup_settings200_response_profilefields_inner import AuthEmailGetSignupSettings200ResponseProfilefieldsInner

# TODO update the JSON string below
json = "{}"
# create an instance of AuthEmailGetSignupSettings200ResponseProfilefieldsInner from a JSON string
auth_email_get_signup_settings200_response_profilefields_inner_instance = AuthEmailGetSignupSettings200ResponseProfilefieldsInner.from_json(json)
# print the JSON string representation of the object
print(AuthEmailGetSignupSettings200ResponseProfilefieldsInner.to_json())

# convert the object into a dict
auth_email_get_signup_settings200_response_profilefields_inner_dict = auth_email_get_signup_settings200_response_profilefields_inner_instance.to_dict()
# create an instance of AuthEmailGetSignupSettings200ResponseProfilefieldsInner from a dict
auth_email_get_signup_settings200_response_profilefields_inner_from_dict = AuthEmailGetSignupSettings200ResponseProfilefieldsInner.from_dict(auth_email_get_signup_settings200_response_profilefields_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


