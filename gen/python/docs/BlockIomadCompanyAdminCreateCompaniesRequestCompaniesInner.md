# BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** | Company location address | [optional] [default to 'null']
**autosubscribe** | **int** | User default forum auto-subscribe | [optional] [default to 1]
**city** | **str** | Company location city | [optional] [default to 'null']
**code** | **str** | Company code | [optional] [default to '']
**companyterminated** | **int** | Company contract is terminated when &lt;&gt; 0 | [optional] [default to 0]
**country** | **str** | Company location country | [optional] [default to 'null']
**custom1** | **str** | Company custom 1 | [optional] [default to 'null']
**custom2** | **str** | Company custom 2 | [optional] [default to 'null']
**custom3** | **str** | Company custom 3 | [optional] [default to 'null']
**customcss** | **str** | Company custom css | [optional] [default to '']
**ecommerce** | **int** | Ecommerce is disabled when &#x3D; 0 | [optional] [default to 0]
**headingcolor** | **str** | Company heading color | [optional] [default to '']
**hostname** | **str** | Company hostname | [optional] [default to '']
**htmleditor** | **int** | User default text editor | [optional] [default to 1]
**lang** | **str** | User default language | [optional] [default to 'en']
**linkcolor** | **str** | Company ink color | [optional] [default to '']
**maildigest** | **int** | User default digest type | [optional] [default to 0]
**maildisplay** | **int** | User default email display | [optional] [default to 2]
**mailformat** | **int** | User default email format | [optional] [default to 1]
**maincolor** | **str** | Company main color | [optional] [default to '']
**maxusers** | **int** | Company maximum number of users | [optional] [default to 0]
**name** | **str** | Company long name | [optional] [default to 'null']
**parentid** | **int** | ID of parent company | [optional] [default to 0]
**postcode** | **str** | Company location postcode | [optional] [default to 'null']
**region** | **str** | Company location region | [optional] [default to 'null']
**screenreader** | **int** | User default screen reader | [optional] [default to 0]
**shortname** | **str** | Compay short name | [optional] [default to 'null']
**suspendafter** | **int** | Number of seconds after termination date to suspend the company | [optional] [default to 0]
**suspended** | **int** | Company is suspended when &lt;&gt; 0 | [optional] [default to 0]
**theme** | **str** | Company theme | [optional] [default to '']
**timezone** | **str** | User default timezone | [optional] [default to '99']
**trackforums** | **int** | User default forum tracking | [optional] [default to 0]
**validto** | **int** | Contract termination date in unix timestamp | [optional] [default to null]

## Example

```python
from openapi_client.models.block_iomad_company_admin_create_companies_request_companies_inner import BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner from a JSON string
block_iomad_company_admin_create_companies_request_companies_inner_instance = BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner.from_json(json)
# print the JSON string representation of the object
print(BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner.to_json())

# convert the object into a dict
block_iomad_company_admin_create_companies_request_companies_inner_dict = block_iomad_company_admin_create_companies_request_companies_inner_instance.to_dict()
# create an instance of BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner from a dict
block_iomad_company_admin_create_companies_request_companies_inner_from_dict = BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner.from_dict(block_iomad_company_admin_create_companies_request_companies_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


