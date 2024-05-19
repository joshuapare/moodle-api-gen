# ModLessonGetLessonAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptscount** | **int32** | The number of attempts done by the user. | [default to null]
**Cangrade** | **bool** | Whether the user can grade the lesson or not. | [default to null]
**Canmanage** | **bool** | Whether the user can manage the lesson or not. | [default to null]
**Canviewreports** | **bool** | Whether the user can view the lesson reports or not. | [default to null]
**Firstpageid** | **int32** | The lesson first page id. | [default to null]
**Lastpageseen** | **int32** | The last page seen id. | [default to null]
**Leftduringtimedsession** | **bool** | Whether the user left during a timed session. | [default to null]
**Preventaccessreasons** | [**[]ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner**](ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner.md) |  | 
**Reviewmode** | **bool** | Whether the lesson is in review mode for the current user. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonGetLessonAccessInformation200Response

`func NewModLessonGetLessonAccessInformation200Response(attemptscount int32, cangrade bool, canmanage bool, canviewreports bool, firstpageid int32, lastpageseen int32, leftduringtimedsession bool, preventaccessreasons []ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner, reviewmode bool, ) *ModLessonGetLessonAccessInformation200Response`

NewModLessonGetLessonAccessInformation200Response instantiates a new ModLessonGetLessonAccessInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetLessonAccessInformation200ResponseWithDefaults

`func NewModLessonGetLessonAccessInformation200ResponseWithDefaults() *ModLessonGetLessonAccessInformation200Response`

NewModLessonGetLessonAccessInformation200ResponseWithDefaults instantiates a new ModLessonGetLessonAccessInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptscount

`func (o *ModLessonGetLessonAccessInformation200Response) GetAttemptscount() int32`

GetAttemptscount returns the Attemptscount field if non-nil, zero value otherwise.

### GetAttemptscountOk

`func (o *ModLessonGetLessonAccessInformation200Response) GetAttemptscountOk() (*int32, bool)`

GetAttemptscountOk returns a tuple with the Attemptscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptscount

`func (o *ModLessonGetLessonAccessInformation200Response) SetAttemptscount(v int32)`

SetAttemptscount sets Attemptscount field to given value.


### GetCangrade

`func (o *ModLessonGetLessonAccessInformation200Response) GetCangrade() bool`

GetCangrade returns the Cangrade field if non-nil, zero value otherwise.

### GetCangradeOk

`func (o *ModLessonGetLessonAccessInformation200Response) GetCangradeOk() (*bool, bool)`

GetCangradeOk returns a tuple with the Cangrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCangrade

`func (o *ModLessonGetLessonAccessInformation200Response) SetCangrade(v bool)`

SetCangrade sets Cangrade field to given value.


### GetCanmanage

`func (o *ModLessonGetLessonAccessInformation200Response) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *ModLessonGetLessonAccessInformation200Response) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *ModLessonGetLessonAccessInformation200Response) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetCanviewreports

`func (o *ModLessonGetLessonAccessInformation200Response) GetCanviewreports() bool`

GetCanviewreports returns the Canviewreports field if non-nil, zero value otherwise.

### GetCanviewreportsOk

`func (o *ModLessonGetLessonAccessInformation200Response) GetCanviewreportsOk() (*bool, bool)`

GetCanviewreportsOk returns a tuple with the Canviewreports field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewreports

`func (o *ModLessonGetLessonAccessInformation200Response) SetCanviewreports(v bool)`

SetCanviewreports sets Canviewreports field to given value.


### GetFirstpageid

`func (o *ModLessonGetLessonAccessInformation200Response) GetFirstpageid() int32`

GetFirstpageid returns the Firstpageid field if non-nil, zero value otherwise.

### GetFirstpageidOk

`func (o *ModLessonGetLessonAccessInformation200Response) GetFirstpageidOk() (*int32, bool)`

GetFirstpageidOk returns a tuple with the Firstpageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstpageid

`func (o *ModLessonGetLessonAccessInformation200Response) SetFirstpageid(v int32)`

SetFirstpageid sets Firstpageid field to given value.


### GetLastpageseen

`func (o *ModLessonGetLessonAccessInformation200Response) GetLastpageseen() int32`

GetLastpageseen returns the Lastpageseen field if non-nil, zero value otherwise.

### GetLastpageseenOk

`func (o *ModLessonGetLessonAccessInformation200Response) GetLastpageseenOk() (*int32, bool)`

GetLastpageseenOk returns a tuple with the Lastpageseen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastpageseen

`func (o *ModLessonGetLessonAccessInformation200Response) SetLastpageseen(v int32)`

SetLastpageseen sets Lastpageseen field to given value.


### GetLeftduringtimedsession

`func (o *ModLessonGetLessonAccessInformation200Response) GetLeftduringtimedsession() bool`

GetLeftduringtimedsession returns the Leftduringtimedsession field if non-nil, zero value otherwise.

### GetLeftduringtimedsessionOk

`func (o *ModLessonGetLessonAccessInformation200Response) GetLeftduringtimedsessionOk() (*bool, bool)`

GetLeftduringtimedsessionOk returns a tuple with the Leftduringtimedsession field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeftduringtimedsession

`func (o *ModLessonGetLessonAccessInformation200Response) SetLeftduringtimedsession(v bool)`

SetLeftduringtimedsession sets Leftduringtimedsession field to given value.


### GetPreventaccessreasons

`func (o *ModLessonGetLessonAccessInformation200Response) GetPreventaccessreasons() []ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner`

GetPreventaccessreasons returns the Preventaccessreasons field if non-nil, zero value otherwise.

### GetPreventaccessreasonsOk

`func (o *ModLessonGetLessonAccessInformation200Response) GetPreventaccessreasonsOk() (*[]ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner, bool)`

GetPreventaccessreasonsOk returns a tuple with the Preventaccessreasons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreventaccessreasons

`func (o *ModLessonGetLessonAccessInformation200Response) SetPreventaccessreasons(v []ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner)`

SetPreventaccessreasons sets Preventaccessreasons field to given value.


### GetReviewmode

`func (o *ModLessonGetLessonAccessInformation200Response) GetReviewmode() bool`

GetReviewmode returns the Reviewmode field if non-nil, zero value otherwise.

### GetReviewmodeOk

`func (o *ModLessonGetLessonAccessInformation200Response) GetReviewmodeOk() (*bool, bool)`

GetReviewmodeOk returns a tuple with the Reviewmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewmode

`func (o *ModLessonGetLessonAccessInformation200Response) SetReviewmode(v bool)`

SetReviewmode sets Reviewmode field to given value.


### GetWarnings

`func (o *ModLessonGetLessonAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonGetLessonAccessInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonGetLessonAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonGetLessonAccessInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


