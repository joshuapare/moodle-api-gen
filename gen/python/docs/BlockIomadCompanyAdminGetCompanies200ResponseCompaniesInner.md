# BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** | Company location address | [optional] 
**autosubscribe** | **int** | User default forum auto-subscribe | [optional] 
**city** | **str** | Company location city | [optional] 
**code** | **str** | Compay code | [optional] 
**companyterminated** | **int** | Company contract is terminated when &lt;&gt; 0 | [optional] [default to 0]
**country** | **str** | Company location country | [optional] 
**custom1** | **str** | Company custom 1 | [optional] 
**custom2** | **str** | Company custom 2 | [optional] 
**custom3** | **str** | Company custom 3 | [optional] 
**customcss** | **str** | Company custom css | [optional] [default to '']
**ecommerce** | **int** | Ecommerce is disabled when &#x3D; 0 | [optional] [default to 0]
**headingcolor** | **str** | Company heading color | [optional] [default to '']
**hostname** | **str** | Company hostname | [optional] [default to '']
**htmleditor** | **int** | User default text editor | [optional] 
**id** | **int** | Companid ID | [optional] [default to null]
**lang** | **str** | User default language | [optional] 
**linkcolor** | **str** | Company ink color | [optional] [default to '']
**maildigest** | **int** | User default digest type | [optional] 
**maildisplay** | **int** | User default email display | [optional] 
**mailformat** | **int** | User default email format | [optional] 
**maincolor** | **str** | Company main color | [optional] [default to '']
**maxusers** | **int** | Company maximum number of users | [optional] [default to 0]
**name** | **str** | Company long name | [optional] 
**parentid** | **int** | ID of parent company | [optional] [default to 0]
**region** | **str** | Company location region | [optional] 
**screenreader** | **int** | User default screen reader | [optional] 
**shortname** | **str** | Compay short name | [optional] 
**suspendafter** | **int** | Number of seconds after termination date to suspend the company | [optional] [default to 0]
**suspended** | **int** | Company is suspended when &lt;&gt; 0 | [optional] 
**theme** | **str** | Company theme | [optional] [default to '']
**timezone** | **str** | User default timezone | [optional] 
**trackforums** | **int** | User default forum tracking | [optional] 
**validto** | **int** | Contract termination date in unix timestamp | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_get_companies200_response_companies_inner import BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner from a JSON string
block_iomad_company_admin_get_companies200_response_companies_inner_instance = BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.to_json())

# convert the object into a dict
block_iomad_company_admin_get_companies200_response_companies_inner_dict = block_iomad_company_admin_get_companies200_response_companies_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner from a dict
block_iomad_company_admin_get_companies200_response_companies_inner_from_dict = BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.from_dict(block_iomad_company_admin_get_companies200_response_companies_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


