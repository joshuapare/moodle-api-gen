# ModLtiUpdateToolType200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Capabilitygroups** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Clientid** | **string** | Client ID | 
**Courseid** | Pointer to **int32** | Tool type course | [optional] [default to 0]
**Deploymentid** | **int32** | Deployment ID | 
**Description** | **string** | Tool type description | 
**Hascapabilitygroups** | **bool** | Indicate if capabilitygroups is populated | 
**Id** | **int32** | Tool type id | 
**Instancecount** | **int32** | The number of times this tool is being used | 
**Instanceids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Name** | **string** | Tool type name | 
**Platformid** | **string** | Platform ID | 
**State** | [**ModLtiGetToolTypesAndProxies200ResponseTypesInnerState**](ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.md) |  | 
**Urls** | [**ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls**](ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.md) |  | 

## Methods

### NewModLtiUpdateToolType200Response

`func NewModLtiUpdateToolType200Response(clientid string, deploymentid int32, description string, hascapabilitygroups bool, id int32, instancecount int32, name string, platformid string, state ModLtiGetToolTypesAndProxies200ResponseTypesInnerState, urls ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls, ) *ModLtiUpdateToolType200Response`

NewModLtiUpdateToolType200Response instantiates a new ModLtiUpdateToolType200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLtiUpdateToolType200ResponseWithDefaults

`func NewModLtiUpdateToolType200ResponseWithDefaults() *ModLtiUpdateToolType200Response`

NewModLtiUpdateToolType200ResponseWithDefaults instantiates a new ModLtiUpdateToolType200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCapabilitygroups

`func (o *ModLtiUpdateToolType200Response) GetCapabilitygroups() []map[string]interface{}`

GetCapabilitygroups returns the Capabilitygroups field if non-nil, zero value otherwise.

### GetCapabilitygroupsOk

`func (o *ModLtiUpdateToolType200Response) GetCapabilitygroupsOk() (*[]map[string]interface{}, bool)`

GetCapabilitygroupsOk returns a tuple with the Capabilitygroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapabilitygroups

`func (o *ModLtiUpdateToolType200Response) SetCapabilitygroups(v []map[string]interface{})`

SetCapabilitygroups sets Capabilitygroups field to given value.

### HasCapabilitygroups

`func (o *ModLtiUpdateToolType200Response) HasCapabilitygroups() bool`

HasCapabilitygroups returns a boolean if a field has been set.

### GetClientid

`func (o *ModLtiUpdateToolType200Response) GetClientid() string`

GetClientid returns the Clientid field if non-nil, zero value otherwise.

### GetClientidOk

`func (o *ModLtiUpdateToolType200Response) GetClientidOk() (*string, bool)`

GetClientidOk returns a tuple with the Clientid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientid

`func (o *ModLtiUpdateToolType200Response) SetClientid(v string)`

SetClientid sets Clientid field to given value.


### GetCourseid

`func (o *ModLtiUpdateToolType200Response) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModLtiUpdateToolType200Response) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModLtiUpdateToolType200Response) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *ModLtiUpdateToolType200Response) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetDeploymentid

`func (o *ModLtiUpdateToolType200Response) GetDeploymentid() int32`

GetDeploymentid returns the Deploymentid field if non-nil, zero value otherwise.

### GetDeploymentidOk

`func (o *ModLtiUpdateToolType200Response) GetDeploymentidOk() (*int32, bool)`

GetDeploymentidOk returns a tuple with the Deploymentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeploymentid

`func (o *ModLtiUpdateToolType200Response) SetDeploymentid(v int32)`

SetDeploymentid sets Deploymentid field to given value.


### GetDescription

`func (o *ModLtiUpdateToolType200Response) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ModLtiUpdateToolType200Response) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ModLtiUpdateToolType200Response) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetHascapabilitygroups

`func (o *ModLtiUpdateToolType200Response) GetHascapabilitygroups() bool`

GetHascapabilitygroups returns the Hascapabilitygroups field if non-nil, zero value otherwise.

### GetHascapabilitygroupsOk

`func (o *ModLtiUpdateToolType200Response) GetHascapabilitygroupsOk() (*bool, bool)`

GetHascapabilitygroupsOk returns a tuple with the Hascapabilitygroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHascapabilitygroups

`func (o *ModLtiUpdateToolType200Response) SetHascapabilitygroups(v bool)`

SetHascapabilitygroups sets Hascapabilitygroups field to given value.


### GetId

`func (o *ModLtiUpdateToolType200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLtiUpdateToolType200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLtiUpdateToolType200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetInstancecount

`func (o *ModLtiUpdateToolType200Response) GetInstancecount() int32`

GetInstancecount returns the Instancecount field if non-nil, zero value otherwise.

### GetInstancecountOk

`func (o *ModLtiUpdateToolType200Response) GetInstancecountOk() (*int32, bool)`

GetInstancecountOk returns a tuple with the Instancecount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstancecount

`func (o *ModLtiUpdateToolType200Response) SetInstancecount(v int32)`

SetInstancecount sets Instancecount field to given value.


### GetInstanceids

`func (o *ModLtiUpdateToolType200Response) GetInstanceids() []map[string]interface{}`

GetInstanceids returns the Instanceids field if non-nil, zero value otherwise.

### GetInstanceidsOk

`func (o *ModLtiUpdateToolType200Response) GetInstanceidsOk() (*[]map[string]interface{}, bool)`

GetInstanceidsOk returns a tuple with the Instanceids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceids

`func (o *ModLtiUpdateToolType200Response) SetInstanceids(v []map[string]interface{})`

SetInstanceids sets Instanceids field to given value.

### HasInstanceids

`func (o *ModLtiUpdateToolType200Response) HasInstanceids() bool`

HasInstanceids returns a boolean if a field has been set.

### GetName

`func (o *ModLtiUpdateToolType200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModLtiUpdateToolType200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModLtiUpdateToolType200Response) SetName(v string)`

SetName sets Name field to given value.


### GetPlatformid

`func (o *ModLtiUpdateToolType200Response) GetPlatformid() string`

GetPlatformid returns the Platformid field if non-nil, zero value otherwise.

### GetPlatformidOk

`func (o *ModLtiUpdateToolType200Response) GetPlatformidOk() (*string, bool)`

GetPlatformidOk returns a tuple with the Platformid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatformid

`func (o *ModLtiUpdateToolType200Response) SetPlatformid(v string)`

SetPlatformid sets Platformid field to given value.


### GetState

`func (o *ModLtiUpdateToolType200Response) GetState() ModLtiGetToolTypesAndProxies200ResponseTypesInnerState`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *ModLtiUpdateToolType200Response) GetStateOk() (*ModLtiGetToolTypesAndProxies200ResponseTypesInnerState, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *ModLtiUpdateToolType200Response) SetState(v ModLtiGetToolTypesAndProxies200ResponseTypesInnerState)`

SetState sets State field to given value.


### GetUrls

`func (o *ModLtiUpdateToolType200Response) GetUrls() ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *ModLtiUpdateToolType200Response) GetUrlsOk() (*ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *ModLtiUpdateToolType200Response) SetUrls(v ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls)`

SetUrls sets Urls field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


