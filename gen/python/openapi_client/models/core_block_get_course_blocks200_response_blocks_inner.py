# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.core_block_get_course_blocks200_response_blocks_inner_configs_inner import CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner
from openapi_client.models.core_block_get_course_blocks200_response_blocks_inner_contents import CoreBlockGetCourseBlocks200ResponseBlocksInnerContents
from typing import Optional, Set
from typing_extensions import Self

class CoreBlockGetCourseBlocks200ResponseBlocksInner(BaseModel):
    """
    Block information.
    """ # noqa: E501
    collapsible: Optional[StrictBool] = Field(default=False, description="Whether the block is collapsible.")
    configs: Optional[List[CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner]] = None
    contents: Optional[CoreBlockGetCourseBlocks200ResponseBlocksInnerContents] = None
    dockable: Optional[StrictBool] = Field(default=False, description="Whether the block is dockable.")
    instanceid: Optional[StrictInt] = Field(default=null, description="Block instance id.")
    name: Optional[StrictStr] = Field(default='null', description="Block name.")
    positionid: Optional[StrictInt] = Field(default=null, description="Position id.")
    region: Optional[StrictStr] = Field(default='null', description="Block region.")
    visible: Optional[StrictBool] = Field(default=False, description="Whether the block is visible.")
    weight: Optional[StrictInt] = Field(default=null, description="Used to order blocks within a region.")
    __properties: ClassVar[List[str]] = ["collapsible", "configs", "contents", "dockable", "instanceid", "name", "positionid", "region", "visible", "weight"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of CoreBlockGetCourseBlocks200ResponseBlocksInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in configs (list)
        _items = []
        if self.configs:
            for _item in self.configs:
                if _item:
                    _items.append(_item.to_dict())
            _dict['configs'] = _items
        # override the default output from pydantic by calling `to_dict()` of contents
        if self.contents:
            _dict['contents'] = self.contents.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreBlockGetCourseBlocks200ResponseBlocksInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "collapsible": obj.get("collapsible") if obj.get("collapsible") is not None else False,
            "configs": [CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner.from_dict(_item) for _item in obj["configs"]] if obj.get("configs") is not None else None,
            "contents": CoreBlockGetCourseBlocks200ResponseBlocksInnerContents.from_dict(obj["contents"]) if obj.get("contents") is not None else None,
            "dockable": obj.get("dockable") if obj.get("dockable") is not None else False,
            "instanceid": obj.get("instanceid") if obj.get("instanceid") is not None else null,
            "name": obj.get("name") if obj.get("name") is not None else 'null',
            "positionid": obj.get("positionid") if obj.get("positionid") is not None else null,
            "region": obj.get("region") if obj.get("region") is not None else 'null',
            "visible": obj.get("visible") if obj.get("visible") is not None else False,
            "weight": obj.get("weight") if obj.get("weight") is not None else null
        })
        return _obj


