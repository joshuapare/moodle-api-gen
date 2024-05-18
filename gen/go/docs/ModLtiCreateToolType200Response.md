# ModLtiCreateToolType200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Capabilitygroups** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Clientid** | **string** | Client ID | [default to "null"]
**Courseid** | Pointer to **int32** | Tool type course | [optional] [default to 0]
**Deploymentid** | **int32** | Deployment ID | [default to null]
**Description** | **string** | Tool type description | [default to "null"]
**Hascapabilitygroups** | **bool** | Indicate if capabilitygroups is populated | [default to null]
**Id** | **int32** | Tool type id | [default to null]
**Instancecount** | **int32** | The number of times this tool is being used | [default to null]
**Instanceids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Name** | **string** | Tool type name | [default to "null"]
**Platformid** | **string** | Platform ID | [default to "null"]
**State** | [**ModLtiCreateToolType200ResponseState**](ModLtiCreateToolType200ResponseState.md) |  | 
**Urls** | [**ModLtiCreateToolType200ResponseUrls**](ModLtiCreateToolType200ResponseUrls.md) |  | 

## Methods

### NewModLtiCreateToolType200Response

`func NewModLtiCreateToolType200Response(clientid string, deploymentid int32, description string, hascapabilitygroups bool, id int32, instancecount int32, name string, platformid string, state ModLtiCreateToolType200ResponseState, urls ModLtiCreateToolType200ResponseUrls, ) *ModLtiCreateToolType200Response`

NewModLtiCreateToolType200Response instantiates a new ModLtiCreateToolType200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLtiCreateToolType200ResponseWithDefaults

`func NewModLtiCreateToolType200ResponseWithDefaults() *ModLtiCreateToolType200Response`

NewModLtiCreateToolType200ResponseWithDefaults instantiates a new ModLtiCreateToolType200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCapabilitygroups

`func (o *ModLtiCreateToolType200Response) GetCapabilitygroups() []map[string]interface{}`

GetCapabilitygroups returns the Capabilitygroups field if non-nil, zero value otherwise.

### GetCapabilitygroupsOk

`func (o *ModLtiCreateToolType200Response) GetCapabilitygroupsOk() (*[]map[string]interface{}, bool)`

GetCapabilitygroupsOk returns a tuple with the Capabilitygroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapabilitygroups

`func (o *ModLtiCreateToolType200Response) SetCapabilitygroups(v []map[string]interface{})`

SetCapabilitygroups sets Capabilitygroups field to given value.

### HasCapabilitygroups

`func (o *ModLtiCreateToolType200Response) HasCapabilitygroups() bool`

HasCapabilitygroups returns a boolean if a field has been set.

### GetClientid

`func (o *ModLtiCreateToolType200Response) GetClientid() string`

GetClientid returns the Clientid field if non-nil, zero value otherwise.

### GetClientidOk

`func (o *ModLtiCreateToolType200Response) GetClientidOk() (*string, bool)`

GetClientidOk returns a tuple with the Clientid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientid

`func (o *ModLtiCreateToolType200Response) SetClientid(v string)`

SetClientid sets Clientid field to given value.


### GetCourseid

`func (o *ModLtiCreateToolType200Response) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModLtiCreateToolType200Response) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModLtiCreateToolType200Response) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *ModLtiCreateToolType200Response) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetDeploymentid

`func (o *ModLtiCreateToolType200Response) GetDeploymentid() int32`

GetDeploymentid returns the Deploymentid field if non-nil, zero value otherwise.

### GetDeploymentidOk

`func (o *ModLtiCreateToolType200Response) GetDeploymentidOk() (*int32, bool)`

GetDeploymentidOk returns a tuple with the Deploymentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeploymentid

`func (o *ModLtiCreateToolType200Response) SetDeploymentid(v int32)`

SetDeploymentid sets Deploymentid field to given value.


### GetDescription

`func (o *ModLtiCreateToolType200Response) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ModLtiCreateToolType200Response) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ModLtiCreateToolType200Response) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetHascapabilitygroups

`func (o *ModLtiCreateToolType200Response) GetHascapabilitygroups() bool`

GetHascapabilitygroups returns the Hascapabilitygroups field if non-nil, zero value otherwise.

### GetHascapabilitygroupsOk

`func (o *ModLtiCreateToolType200Response) GetHascapabilitygroupsOk() (*bool, bool)`

GetHascapabilitygroupsOk returns a tuple with the Hascapabilitygroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHascapabilitygroups

`func (o *ModLtiCreateToolType200Response) SetHascapabilitygroups(v bool)`

SetHascapabilitygroups sets Hascapabilitygroups field to given value.


### GetId

`func (o *ModLtiCreateToolType200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLtiCreateToolType200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLtiCreateToolType200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetInstancecount

`func (o *ModLtiCreateToolType200Response) GetInstancecount() int32`

GetInstancecount returns the Instancecount field if non-nil, zero value otherwise.

### GetInstancecountOk

`func (o *ModLtiCreateToolType200Response) GetInstancecountOk() (*int32, bool)`

GetInstancecountOk returns a tuple with the Instancecount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstancecount

`func (o *ModLtiCreateToolType200Response) SetInstancecount(v int32)`

SetInstancecount sets Instancecount field to given value.


### GetInstanceids

`func (o *ModLtiCreateToolType200Response) GetInstanceids() []map[string]interface{}`

GetInstanceids returns the Instanceids field if non-nil, zero value otherwise.

### GetInstanceidsOk

`func (o *ModLtiCreateToolType200Response) GetInstanceidsOk() (*[]map[string]interface{}, bool)`

GetInstanceidsOk returns a tuple with the Instanceids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceids

`func (o *ModLtiCreateToolType200Response) SetInstanceids(v []map[string]interface{})`

SetInstanceids sets Instanceids field to given value.

### HasInstanceids

`func (o *ModLtiCreateToolType200Response) HasInstanceids() bool`

HasInstanceids returns a boolean if a field has been set.

### GetName

`func (o *ModLtiCreateToolType200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModLtiCreateToolType200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModLtiCreateToolType200Response) SetName(v string)`

SetName sets Name field to given value.


### GetPlatformid

`func (o *ModLtiCreateToolType200Response) GetPlatformid() string`

GetPlatformid returns the Platformid field if non-nil, zero value otherwise.

### GetPlatformidOk

`func (o *ModLtiCreateToolType200Response) GetPlatformidOk() (*string, bool)`

GetPlatformidOk returns a tuple with the Platformid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatformid

`func (o *ModLtiCreateToolType200Response) SetPlatformid(v string)`

SetPlatformid sets Platformid field to given value.


### GetState

`func (o *ModLtiCreateToolType200Response) GetState() ModLtiCreateToolType200ResponseState`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *ModLtiCreateToolType200Response) GetStateOk() (*ModLtiCreateToolType200ResponseState, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *ModLtiCreateToolType200Response) SetState(v ModLtiCreateToolType200ResponseState)`

SetState sets State field to given value.


### GetUrls

`func (o *ModLtiCreateToolType200Response) GetUrls() ModLtiCreateToolType200ResponseUrls`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *ModLtiCreateToolType200Response) GetUrlsOk() (*ModLtiCreateToolType200ResponseUrls, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *ModLtiCreateToolType200Response) SetUrls(v ModLtiCreateToolType200ResponseUrls)`

SetUrls sets Urls field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


