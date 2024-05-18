# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.tool_dataprivacy_tree_extra_branches200_response_branches_inner import ToolDataprivacyTreeExtraBranches200ResponseBranchesInner

class TestToolDataprivacyTreeExtraBranches200ResponseBranchesInner(unittest.TestCase):
    """ToolDataprivacyTreeExtraBranches200ResponseBranchesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ToolDataprivacyTreeExtraBranches200ResponseBranchesInner:
        """Test ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ToolDataprivacyTreeExtraBranches200ResponseBranchesInner`
        """
        model = ToolDataprivacyTreeExtraBranches200ResponseBranchesInner()
        if include_optional:
            return ToolDataprivacyTreeExtraBranches200ResponseBranchesInner(
                branches = [
                    openapi_client.models.tool_dataprivacy_tree_extra_branches_200_response_branches_inner_branches_inner.tool_dataprivacy_tree_extra_branches_200_response_branches_inner_branches_inner(
                        branches = [
                            None
                            ], 
                        contextid = 56, 
                        contextlevel = 56, 
                        expandcontextid = 56, 
                        expanded = 56, 
                        expandelement = 'null', 
                        text = 'null', )
                    ],
                contextid = 56,
                contextlevel = 56,
                expandcontextid = 56,
                expanded = 56,
                expandelement = '',
                text = ''
            )
        else:
            return ToolDataprivacyTreeExtraBranches200ResponseBranchesInner(
        )
        """

    def testToolDataprivacyTreeExtraBranches200ResponseBranchesInner(self):
        """Test ToolDataprivacyTreeExtraBranches200ResponseBranchesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()