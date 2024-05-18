# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.tool_usertours_api import ToolUsertoursApi


class TestToolUsertoursApi(unittest.TestCase):
    """ToolUsertoursApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ToolUsertoursApi()

    def tearDown(self) -> None:
        pass

    def test_tool_usertours_complete_tour(self) -> None:
        """Test case for tool_usertours_complete_tour

        Mark the specified tour as completed for the current user
        """
        pass

    def test_tool_usertours_fetch_and_start_tour(self) -> None:
        """Test case for tool_usertours_fetch_and_start_tour

        Fetch the specified tour
        """
        pass

    def test_tool_usertours_reset_tour(self) -> None:
        """Test case for tool_usertours_reset_tour

        Remove the specified tour
        """
        pass

    def test_tool_usertours_step_shown(self) -> None:
        """Test case for tool_usertours_step_shown

        Mark the specified step as completed for the current user
        """
        pass


if __name__ == '__main__':
    unittest.main()