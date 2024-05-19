/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModFolderGetFoldersByCourses200ResponseFoldersInner
    /// </summary>
    [DataContract(Name = "mod_folder_get_folders_by_courses_200_response_folders_inner")]
    public partial class ModFolderGetFoldersByCourses200ResponseFoldersInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFolderGetFoldersByCourses200ResponseFoldersInner" /> class.
        /// </summary>
        /// <param name="course">Course id.</param>
        /// <param name="coursemodule">Course module id.</param>
        /// <param name="display">Display type of folder contents on a separate page or inline (default to null).</param>
        /// <param name="forcedownload">Whether file download is forced (default to null).</param>
        /// <param name="groupingid">Group id.</param>
        /// <param name="groupmode">Group mode.</param>
        /// <param name="id">Activity instance id.</param>
        /// <param name="intro">Activity introduction.</param>
        /// <param name="introfiles">introfiles.</param>
        /// <param name="introformat">intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="lang">Forced activity language.</param>
        /// <param name="name">Activity name.</param>
        /// <param name="revision">Incremented when after each file changes, to avoid cache (default to null).</param>
        /// <param name="section">Course section id.</param>
        /// <param name="showdownloadfolder">Whether to show the download folder button (default to null).</param>
        /// <param name="showexpanded">1 &#x3D; expanded, 0 &#x3D; collapsed for sub-folders (default to null).</param>
        /// <param name="timemodified">Last time the folder was modified (default to null).</param>
        /// <param name="visible">Visible.</param>
        public ModFolderGetFoldersByCourses200ResponseFoldersInner(int course = default(int), int coursemodule = default(int), int display = null, int forcedownload = null, int groupingid = default(int), int groupmode = default(int), int id = default(int), string intro = default(string), List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> introfiles = default(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>), int introformat = default(int), string lang = default(string), string name = default(string), int revision = null, int section = default(int), int showdownloadfolder = null, int showexpanded = null, int timemodified = null, bool visible = default(bool))
        {
            this.Course = course;
            this.Coursemodule = coursemodule;
            this.Display = display;
            this.Forcedownload = forcedownload;
            this.Groupingid = groupingid;
            this.Groupmode = groupmode;
            this.Id = id;
            this.Intro = intro;
            this.Introfiles = introfiles;
            this.Introformat = introformat;
            this.Lang = lang;
            this.Name = name;
            this.Revision = revision;
            this.Section = section;
            this.Showdownloadfolder = showdownloadfolder;
            this.Showexpanded = showexpanded;
            this.Timemodified = timemodified;
            this.Visible = visible;
        }

        /// <summary>
        /// Course id
        /// </summary>
        /// <value>Course id</value>
        [DataMember(Name = "course", EmitDefaultValue = false)]
        public int Course { get; set; }

        /// <summary>
        /// Course module id
        /// </summary>
        /// <value>Course module id</value>
        [DataMember(Name = "coursemodule", EmitDefaultValue = false)]
        public int Coursemodule { get; set; }

        /// <summary>
        /// Display type of folder contents on a separate page or inline
        /// </summary>
        /// <value>Display type of folder contents on a separate page or inline</value>
        [DataMember(Name = "display", EmitDefaultValue = false)]
        public int Display { get; set; }

        /// <summary>
        /// Whether file download is forced
        /// </summary>
        /// <value>Whether file download is forced</value>
        [DataMember(Name = "forcedownload", EmitDefaultValue = false)]
        public int Forcedownload { get; set; }

        /// <summary>
        /// Group id
        /// </summary>
        /// <value>Group id</value>
        [DataMember(Name = "groupingid", EmitDefaultValue = false)]
        public int Groupingid { get; set; }

        /// <summary>
        /// Group mode
        /// </summary>
        /// <value>Group mode</value>
        [DataMember(Name = "groupmode", EmitDefaultValue = false)]
        public int Groupmode { get; set; }

        /// <summary>
        /// Activity instance id
        /// </summary>
        /// <value>Activity instance id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Activity introduction
        /// </summary>
        /// <value>Activity introduction</value>
        [DataMember(Name = "intro", EmitDefaultValue = false)]
        public string Intro { get; set; }

        /// <summary>
        /// Gets or Sets Introfiles
        /// </summary>
        [DataMember(Name = "introfiles", EmitDefaultValue = false)]
        public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> Introfiles { get; set; }

        /// <summary>
        /// intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "introformat", EmitDefaultValue = false)]
        public int Introformat { get; set; }

        /// <summary>
        /// Forced activity language
        /// </summary>
        /// <value>Forced activity language</value>
        [DataMember(Name = "lang", EmitDefaultValue = false)]
        public string Lang { get; set; }

        /// <summary>
        /// Activity name
        /// </summary>
        /// <value>Activity name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Incremented when after each file changes, to avoid cache
        /// </summary>
        /// <value>Incremented when after each file changes, to avoid cache</value>
        [DataMember(Name = "revision", EmitDefaultValue = false)]
        public int Revision { get; set; }

        /// <summary>
        /// Course section id
        /// </summary>
        /// <value>Course section id</value>
        [DataMember(Name = "section", EmitDefaultValue = false)]
        public int Section { get; set; }

        /// <summary>
        /// Whether to show the download folder button
        /// </summary>
        /// <value>Whether to show the download folder button</value>
        [DataMember(Name = "showdownloadfolder", EmitDefaultValue = false)]
        public int Showdownloadfolder { get; set; }

        /// <summary>
        /// 1 &#x3D; expanded, 0 &#x3D; collapsed for sub-folders
        /// </summary>
        /// <value>1 &#x3D; expanded, 0 &#x3D; collapsed for sub-folders</value>
        [DataMember(Name = "showexpanded", EmitDefaultValue = false)]
        public int Showexpanded { get; set; }

        /// <summary>
        /// Last time the folder was modified
        /// </summary>
        /// <value>Last time the folder was modified</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// Visible
        /// </summary>
        /// <value>Visible</value>
        [DataMember(Name = "visible", EmitDefaultValue = true)]
        public bool Visible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModFolderGetFoldersByCourses200ResponseFoldersInner {\n");
            sb.Append("  Course: ").Append(Course).Append("\n");
            sb.Append("  Coursemodule: ").Append(Coursemodule).Append("\n");
            sb.Append("  Display: ").Append(Display).Append("\n");
            sb.Append("  Forcedownload: ").Append(Forcedownload).Append("\n");
            sb.Append("  Groupingid: ").Append(Groupingid).Append("\n");
            sb.Append("  Groupmode: ").Append(Groupmode).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Intro: ").Append(Intro).Append("\n");
            sb.Append("  Introfiles: ").Append(Introfiles).Append("\n");
            sb.Append("  Introformat: ").Append(Introformat).Append("\n");
            sb.Append("  Lang: ").Append(Lang).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Revision: ").Append(Revision).Append("\n");
            sb.Append("  Section: ").Append(Section).Append("\n");
            sb.Append("  Showdownloadfolder: ").Append(Showdownloadfolder).Append("\n");
            sb.Append("  Showexpanded: ").Append(Showexpanded).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Visible: ").Append(Visible).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}