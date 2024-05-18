# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.mod_data_api import ModDataApi


class TestModDataApi(unittest.TestCase):
    """ModDataApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ModDataApi()

    def tearDown(self) -> None:
        pass

    def test_mod_data_add_entry(self) -> None:
        """Test case for mod_data_add_entry

        Adds a new entry.
        """
        pass

    def test_mod_data_approve_entry(self) -> None:
        """Test case for mod_data_approve_entry

        Approves or unapproves an entry.
        """
        pass

    def test_mod_data_delete_entry(self) -> None:
        """Test case for mod_data_delete_entry

        Deletes an entry.
        """
        pass

    def test_mod_data_delete_saved_preset(self) -> None:
        """Test case for mod_data_delete_saved_preset

        Delete site user preset.
        """
        pass

    def test_mod_data_get_data_access_information(self) -> None:
        """Test case for mod_data_get_data_access_information

        Return access information for a given database.
        """
        pass

    def test_mod_data_get_databases_by_courses(self) -> None:
        """Test case for mod_data_get_databases_by_courses

        Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.
        """
        pass

    def test_mod_data_get_entries(self) -> None:
        """Test case for mod_data_get_entries

        Return the complete list of entries of the given database.
        """
        pass

    def test_mod_data_get_entry(self) -> None:
        """Test case for mod_data_get_entry

        Return one entry record from the database, including contents optionally.
        """
        pass

    def test_mod_data_get_fields(self) -> None:
        """Test case for mod_data_get_fields

        Return the list of configured fields for the given database.
        """
        pass

    def test_mod_data_get_mapping_information(self) -> None:
        """Test case for mod_data_get_mapping_information

        Get importing information
        """
        pass

    def test_mod_data_search_entries(self) -> None:
        """Test case for mod_data_search_entries

        Search for entries in the given database.
        """
        pass

    def test_mod_data_update_entry(self) -> None:
        """Test case for mod_data_update_entry

        Updates an existing entry.
        """
        pass

    def test_mod_data_view_database(self) -> None:
        """Test case for mod_data_view_database

        Simulate the view.php web interface data: trigger events, completion, etc...
        """
        pass


if __name__ == '__main__':
    unittest.main()