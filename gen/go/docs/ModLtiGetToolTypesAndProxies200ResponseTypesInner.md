# ModLtiGetToolTypesAndProxies200ResponseTypesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Capabilitygroups** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Clientid** | Pointer to **string** | Client ID | [optional] 
**Courseid** | Pointer to **int32** | Tool type course | [optional] [default to 0]
**Deploymentid** | Pointer to **int32** | Deployment ID | [optional] 
**Description** | Pointer to **string** | Tool type description | [optional] 
**Hascapabilitygroups** | Pointer to **bool** | Indicate if capabilitygroups is populated | [optional] 
**Id** | Pointer to **int32** | Tool type id | [optional] 
**Instancecount** | Pointer to **int32** | The number of times this tool is being used | [optional] 
**Instanceids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Name** | Pointer to **string** | Tool type name | [optional] 
**Platformid** | Pointer to **string** | Platform ID | [optional] 
**State** | Pointer to [**ModLtiGetToolTypesAndProxies200ResponseTypesInnerState**](ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.md) |  | [optional] 
**Urls** | Pointer to [**ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls**](ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.md) |  | [optional] 

## Methods

### NewModLtiGetToolTypesAndProxies200ResponseTypesInner

`func NewModLtiGetToolTypesAndProxies200ResponseTypesInner() *ModLtiGetToolTypesAndProxies200ResponseTypesInner`

NewModLtiGetToolTypesAndProxies200ResponseTypesInner instantiates a new ModLtiGetToolTypesAndProxies200ResponseTypesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLtiGetToolTypesAndProxies200ResponseTypesInnerWithDefaults

`func NewModLtiGetToolTypesAndProxies200ResponseTypesInnerWithDefaults() *ModLtiGetToolTypesAndProxies200ResponseTypesInner`

NewModLtiGetToolTypesAndProxies200ResponseTypesInnerWithDefaults instantiates a new ModLtiGetToolTypesAndProxies200ResponseTypesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCapabilitygroups

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetCapabilitygroups() []map[string]interface{}`

GetCapabilitygroups returns the Capabilitygroups field if non-nil, zero value otherwise.

### GetCapabilitygroupsOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetCapabilitygroupsOk() (*[]map[string]interface{}, bool)`

GetCapabilitygroupsOk returns a tuple with the Capabilitygroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapabilitygroups

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetCapabilitygroups(v []map[string]interface{})`

SetCapabilitygroups sets Capabilitygroups field to given value.

### HasCapabilitygroups

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasCapabilitygroups() bool`

HasCapabilitygroups returns a boolean if a field has been set.

### GetClientid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetClientid() string`

GetClientid returns the Clientid field if non-nil, zero value otherwise.

### GetClientidOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetClientidOk() (*string, bool)`

GetClientidOk returns a tuple with the Clientid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetClientid(v string)`

SetClientid sets Clientid field to given value.

### HasClientid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasClientid() bool`

HasClientid returns a boolean if a field has been set.

### GetCourseid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetDeploymentid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetDeploymentid() int32`

GetDeploymentid returns the Deploymentid field if non-nil, zero value otherwise.

### GetDeploymentidOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetDeploymentidOk() (*int32, bool)`

GetDeploymentidOk returns a tuple with the Deploymentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeploymentid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetDeploymentid(v int32)`

SetDeploymentid sets Deploymentid field to given value.

### HasDeploymentid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasDeploymentid() bool`

HasDeploymentid returns a boolean if a field has been set.

### GetDescription

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetHascapabilitygroups

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetHascapabilitygroups() bool`

GetHascapabilitygroups returns the Hascapabilitygroups field if non-nil, zero value otherwise.

### GetHascapabilitygroupsOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetHascapabilitygroupsOk() (*bool, bool)`

GetHascapabilitygroupsOk returns a tuple with the Hascapabilitygroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHascapabilitygroups

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetHascapabilitygroups(v bool)`

SetHascapabilitygroups sets Hascapabilitygroups field to given value.

### HasHascapabilitygroups

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasHascapabilitygroups() bool`

HasHascapabilitygroups returns a boolean if a field has been set.

### GetId

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInstancecount

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetInstancecount() int32`

GetInstancecount returns the Instancecount field if non-nil, zero value otherwise.

### GetInstancecountOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetInstancecountOk() (*int32, bool)`

GetInstancecountOk returns a tuple with the Instancecount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstancecount

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetInstancecount(v int32)`

SetInstancecount sets Instancecount field to given value.

### HasInstancecount

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasInstancecount() bool`

HasInstancecount returns a boolean if a field has been set.

### GetInstanceids

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetInstanceids() []map[string]interface{}`

GetInstanceids returns the Instanceids field if non-nil, zero value otherwise.

### GetInstanceidsOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetInstanceidsOk() (*[]map[string]interface{}, bool)`

GetInstanceidsOk returns a tuple with the Instanceids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceids

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetInstanceids(v []map[string]interface{})`

SetInstanceids sets Instanceids field to given value.

### HasInstanceids

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasInstanceids() bool`

HasInstanceids returns a boolean if a field has been set.

### GetName

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPlatformid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetPlatformid() string`

GetPlatformid returns the Platformid field if non-nil, zero value otherwise.

### GetPlatformidOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetPlatformidOk() (*string, bool)`

GetPlatformidOk returns a tuple with the Platformid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatformid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetPlatformid(v string)`

SetPlatformid sets Platformid field to given value.

### HasPlatformid

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasPlatformid() bool`

HasPlatformid returns a boolean if a field has been set.

### GetState

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetState() ModLtiGetToolTypesAndProxies200ResponseTypesInnerState`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetStateOk() (*ModLtiGetToolTypesAndProxies200ResponseTypesInnerState, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetState(v ModLtiGetToolTypesAndProxies200ResponseTypesInnerState)`

SetState sets State field to given value.

### HasState

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasState() bool`

HasState returns a boolean if a field has been set.

### GetUrls

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetUrls() ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) GetUrlsOk() (*ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) SetUrls(v ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls)`

SetUrls sets Urls field to given value.

### HasUrls

`func (o *ModLtiGetToolTypesAndProxies200ResponseTypesInner) HasUrls() bool`

HasUrls returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


