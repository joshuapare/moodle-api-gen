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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.tool_dataprivacy_tree_extra_branches200_response_branches_inner_branches_inner import ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner
from typing import Optional, Set
from typing_extensions import Self

class ToolDataprivacyTreeExtraBranches200ResponseBranchesInner(BaseModel):
    """
    Node structure
    """ # noqa: E501
    branches: Optional[List[ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner]] = None
    contextid: Optional[StrictInt] = Field(default=None, description="The node contextid")
    contextlevel: Optional[StrictInt] = Field(default=None, description="The node contextlevel")
    expandcontextid: Optional[StrictInt] = Field(default=None, description="The contextid this node expands")
    expanded: Optional[StrictInt] = Field(default=None, description="Is it expanded")
    expandelement: Optional[StrictStr] = Field(default=None, description="What element is this node expanded to")
    text: Optional[StrictStr] = Field(default=None, description="The node text")
    __properties: ClassVar[List[str]] = ["branches", "contextid", "contextlevel", "expandcontextid", "expanded", "expandelement", "text"]

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
        """Create an instance of ToolDataprivacyTreeExtraBranches200ResponseBranchesInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in branches (list)
        _items = []
        if self.branches:
            for _item in self.branches:
                if _item:
                    _items.append(_item.to_dict())
            _dict['branches'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ToolDataprivacyTreeExtraBranches200ResponseBranchesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "branches": [ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner.from_dict(_item) for _item in obj["branches"]] if obj.get("branches") is not None else None,
            "contextid": obj.get("contextid"),
            "contextlevel": obj.get("contextlevel"),
            "expandcontextid": obj.get("expandcontextid"),
            "expanded": obj.get("expanded"),
            "expandelement": obj.get("expandelement"),
            "text": obj.get("text")
        })
        return _obj


