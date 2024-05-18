# ModFeedbackGetItems200ResponseItemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dependitem** | Pointer to **int32** | The item id this item depend on. | [optional] [default to 0]
**Dependvalue** | Pointer to **string** | The depend value. | [optional] 
**Feedback** | Pointer to **int32** | The feedback instance id this records belongs to. | [optional] [default to 0]
**Hasvalue** | Pointer to **int32** | Whether it has a value or not. | [optional] [default to 0]
**Id** | Pointer to **int32** | The record id. | [optional] 
**Itemfiles** | Pointer to [**[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**Itemnumber** | Pointer to **int32** | The item position number | [optional] 
**Label** | Pointer to **string** | The item label. | [optional] 
**Name** | Pointer to **string** | The item name. | [optional] 
**Options** | Pointer to **string** | Different additional settings for the item (question). | [optional] 
**Otherdata** | Pointer to **string** | Additional data that may be required by external functions | [optional] 
**Position** | Pointer to **int32** | The position in the list of questions. | [optional] [default to 0]
**Presentation** | Pointer to **string** | The text describing the item or the available possible answers. | [optional] 
**Required** | Pointer to **bool** | Whether is a item (question) required or not. | [optional] [default to 0]
**Template** | Pointer to **int32** | If it belogns to a template, the template id. | [optional] [default to 0]
**Typ** | Pointer to **string** | The type of the item. | [optional] 

## Methods

### NewModFeedbackGetItems200ResponseItemsInner

`func NewModFeedbackGetItems200ResponseItemsInner() *ModFeedbackGetItems200ResponseItemsInner`

NewModFeedbackGetItems200ResponseItemsInner instantiates a new ModFeedbackGetItems200ResponseItemsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetItems200ResponseItemsInnerWithDefaults

`func NewModFeedbackGetItems200ResponseItemsInnerWithDefaults() *ModFeedbackGetItems200ResponseItemsInner`

NewModFeedbackGetItems200ResponseItemsInnerWithDefaults instantiates a new ModFeedbackGetItems200ResponseItemsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDependitem

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetDependitem() int32`

GetDependitem returns the Dependitem field if non-nil, zero value otherwise.

### GetDependitemOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetDependitemOk() (*int32, bool)`

GetDependitemOk returns a tuple with the Dependitem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDependitem

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetDependitem(v int32)`

SetDependitem sets Dependitem field to given value.

### HasDependitem

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasDependitem() bool`

HasDependitem returns a boolean if a field has been set.

### GetDependvalue

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetDependvalue() string`

GetDependvalue returns the Dependvalue field if non-nil, zero value otherwise.

### GetDependvalueOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetDependvalueOk() (*string, bool)`

GetDependvalueOk returns a tuple with the Dependvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDependvalue

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetDependvalue(v string)`

SetDependvalue sets Dependvalue field to given value.

### HasDependvalue

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasDependvalue() bool`

HasDependvalue returns a boolean if a field has been set.

### GetFeedback

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetFeedback() int32`

GetFeedback returns the Feedback field if non-nil, zero value otherwise.

### GetFeedbackOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetFeedbackOk() (*int32, bool)`

GetFeedbackOk returns a tuple with the Feedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedback

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetFeedback(v int32)`

SetFeedback sets Feedback field to given value.

### HasFeedback

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasFeedback() bool`

HasFeedback returns a boolean if a field has been set.

### GetHasvalue

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetHasvalue() int32`

GetHasvalue returns the Hasvalue field if non-nil, zero value otherwise.

### GetHasvalueOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetHasvalueOk() (*int32, bool)`

GetHasvalueOk returns a tuple with the Hasvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasvalue

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetHasvalue(v int32)`

SetHasvalue sets Hasvalue field to given value.

### HasHasvalue

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasHasvalue() bool`

HasHasvalue returns a boolean if a field has been set.

### GetId

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetItemfiles

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetItemfiles() []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner`

GetItemfiles returns the Itemfiles field if non-nil, zero value otherwise.

### GetItemfilesOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetItemfilesOk() (*[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner, bool)`

GetItemfilesOk returns a tuple with the Itemfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemfiles

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetItemfiles(v []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner)`

SetItemfiles sets Itemfiles field to given value.

### HasItemfiles

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasItemfiles() bool`

HasItemfiles returns a boolean if a field has been set.

### GetItemnumber

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetItemnumber() int32`

GetItemnumber returns the Itemnumber field if non-nil, zero value otherwise.

### GetItemnumberOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetItemnumberOk() (*int32, bool)`

GetItemnumberOk returns a tuple with the Itemnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemnumber

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetItemnumber(v int32)`

SetItemnumber sets Itemnumber field to given value.

### HasItemnumber

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasItemnumber() bool`

HasItemnumber returns a boolean if a field has been set.

### GetLabel

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetLabel(v string)`

SetLabel sets Label field to given value.

### HasLabel

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasLabel() bool`

HasLabel returns a boolean if a field has been set.

### GetName

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOptions

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetOptions() string`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetOptionsOk() (*string, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetOptions(v string)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetOtherdata

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetOtherdata() string`

GetOtherdata returns the Otherdata field if non-nil, zero value otherwise.

### GetOtherdataOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetOtherdataOk() (*string, bool)`

GetOtherdataOk returns a tuple with the Otherdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherdata

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetOtherdata(v string)`

SetOtherdata sets Otherdata field to given value.

### HasOtherdata

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasOtherdata() bool`

HasOtherdata returns a boolean if a field has been set.

### GetPosition

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetPosition() int32`

GetPosition returns the Position field if non-nil, zero value otherwise.

### GetPositionOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetPositionOk() (*int32, bool)`

GetPositionOk returns a tuple with the Position field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPosition

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetPosition(v int32)`

SetPosition sets Position field to given value.

### HasPosition

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasPosition() bool`

HasPosition returns a boolean if a field has been set.

### GetPresentation

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetPresentation() string`

GetPresentation returns the Presentation field if non-nil, zero value otherwise.

### GetPresentationOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetPresentationOk() (*string, bool)`

GetPresentationOk returns a tuple with the Presentation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPresentation

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetPresentation(v string)`

SetPresentation sets Presentation field to given value.

### HasPresentation

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasPresentation() bool`

HasPresentation returns a boolean if a field has been set.

### GetRequired

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetRequired() bool`

GetRequired returns the Required field if non-nil, zero value otherwise.

### GetRequiredOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetRequiredOk() (*bool, bool)`

GetRequiredOk returns a tuple with the Required field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequired

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetRequired(v bool)`

SetRequired sets Required field to given value.

### HasRequired

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasRequired() bool`

HasRequired returns a boolean if a field has been set.

### GetTemplate

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetTemplate() int32`

GetTemplate returns the Template field if non-nil, zero value otherwise.

### GetTemplateOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetTemplateOk() (*int32, bool)`

GetTemplateOk returns a tuple with the Template field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplate

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetTemplate(v int32)`

SetTemplate sets Template field to given value.

### HasTemplate

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasTemplate() bool`

HasTemplate returns a boolean if a field has been set.

### GetTyp

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetTyp() string`

GetTyp returns the Typ field if non-nil, zero value otherwise.

### GetTypOk

`func (o *ModFeedbackGetItems200ResponseItemsInner) GetTypOk() (*string, bool)`

GetTypOk returns a tuple with the Typ field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTyp

`func (o *ModFeedbackGetItems200ResponseItemsInner) SetTyp(v string)`

SetTyp sets Typ field to given value.

### HasTyp

`func (o *ModFeedbackGetItems200ResponseItemsInner) HasTyp() bool`

HasTyp returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


