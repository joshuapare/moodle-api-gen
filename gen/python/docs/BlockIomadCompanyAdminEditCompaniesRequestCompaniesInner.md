# BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** | Company location address | [optional] 
**autosubscribe** | **int** | User default forum auto-subscribe | [optional] [default to null]
**city** | **str** | Company location city | [optional] 
**code** | **str** | Compay code | [optional] [default to 'null']
**companyterminated** | **int** | Company contract is terminated when &lt;&gt; 0 | [optional] [default to null]
**country** | **str** | Company location country | [optional] 
**custom1** | **str** | Company custom 1 | [optional] 
**custom2** | **str** | Company custom 2 | [optional] 
**custom3** | **str** | Company custom 3 | [optional] 
**customcss** | **str** | Company custom css | [optional] [default to 'null']
**ecommerce** | **int** | Ecommerce is disabled when &#x3D; 0 | [optional] [default to null]
**headingcolor** | **str** | Company heading color | [optional] [default to 'null']
**hostname** | **str** | Company hostname | [optional] [default to 'null']
**htmleditor** | **int** | User default text editor | [optional] [default to null]
**id** | **int** | Company id number | [optional] [default to null]
**lang** | **str** | User default language | [optional] [default to 'null']
**linkcolor** | **str** | Company ink color | [optional] [default to 'null']
**maildigest** | **int** | User default digest type | [optional] [default to null]
**maildisplay** | **int** | User default email display | [optional] [default to null]
**mailformat** | **int** | User default email format | [optional] [default to null]
**maincolor** | **str** | Company main color | [optional] [default to 'null']
**maxusers** | **int** | Company maximum number of users | [optional] [default to null]
**name** | **str** | Company long name | [optional] 
**parentid** | **int** | ID of parent company | [optional] [default to null]
**postcode** | **str** | Company location postcode | [optional] 
**region** | **str** | Company location region | [optional] 
**screenreader** | **int** | User default screen reader | [optional] [default to null]
**shortname** | **str** | Compay short name | [optional] 
**suspendafter** | **int** | Number of seconds after termination date to suspend the company | [optional] [default to null]
**suspended** | **int** | Company is suspended when &lt;&gt; 0 | [optional] [default to null]
**theme** | **str** | Company theme | [optional] [default to 'null']
**timezone** | **str** | User default timezone | [optional] [default to 'null']
**trackforums** | **int** | User default forum tracking | [optional] [default to null]
**validto** | **int** | Contract termination date in unix timestamp | [optional] 

## Example

```python
from openapi_client.models.block_iomad_company_admin_edit_companies_request_companies_inner import BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner from a JSON string
block_iomad_company_admin_edit_companies_request_companies_inner_instance = BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner.to_json())

# convert the object into a dict
block_iomad_company_admin_edit_companies_request_companies_inner_dict = block_iomad_company_admin_edit_companies_request_companies_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner from a dict
block_iomad_company_admin_edit_companies_request_companies_inner_from_dict = BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner.from_dict(block_iomad_company_admin_edit_companies_request_companies_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


