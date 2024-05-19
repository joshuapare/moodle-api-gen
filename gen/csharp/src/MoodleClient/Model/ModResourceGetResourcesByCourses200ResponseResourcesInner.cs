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
    /// ModResourceGetResourcesByCourses200ResponseResourcesInner
    /// </summary>
    [DataContract(Name = "mod_resource_get_resources_by_courses_200_response_resources_inner")]
    public partial class ModResourceGetResourcesByCourses200ResponseResourcesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModResourceGetResourcesByCourses200ResponseResourcesInner" /> class.
        /// </summary>
        /// <param name="contentfiles">contentfiles.</param>
        /// <param name="course">Course id.</param>
        /// <param name="coursemodule">Course module id.</param>
        /// <param name="display">How to display the resource (default to null).</param>
        /// <param name="displayoptions">Display options (width, height).</param>
        /// <param name="filterfiles">If filters should be applied to the resource content (default to null).</param>
        /// <param name="groupingid">Group id.</param>
        /// <param name="groupmode">Group mode.</param>
        /// <param name="id">Activity instance id.</param>
        /// <param name="intro">Activity introduction.</param>
        /// <param name="introfiles">introfiles.</param>
        /// <param name="introformat">intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="lang">Forced activity language.</param>
        /// <param name="legacyfiles">Legacy files flag.</param>
        /// <param name="legacyfileslast">Legacy files last control flag.</param>
        /// <param name="name">Activity name.</param>
        /// <param name="revision">Incremented when after each file changes, to avoid cache.</param>
        /// <param name="section">Course section id.</param>
        /// <param name="timemodified">Last time the resource was modified (default to null).</param>
        /// <param name="tobemigrated">Whether this resource was migrated (default to null).</param>
        /// <param name="visible">Visible.</param>
        public ModResourceGetResourcesByCourses200ResponseResourcesInner(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> contentfiles = default(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>), int course = default(int), int coursemodule = default(int), int display = null, string displayoptions = default(string), int filterfiles = null, int groupingid = default(int), int groupmode = default(int), int id = default(int), string intro = default(string), List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> introfiles = default(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>), int introformat = default(int), string lang = default(string), int legacyfiles = default(int), int legacyfileslast = default(int), string name = default(string), int revision = default(int), int section = default(int), int timemodified = null, int tobemigrated = null, bool visible = default(bool))
        {
            this.Contentfiles = contentfiles;
            this.Course = course;
            this.Coursemodule = coursemodule;
            this.Display = display;
            this.Displayoptions = displayoptions;
            this.Filterfiles = filterfiles;
            this.Groupingid = groupingid;
            this.Groupmode = groupmode;
            this.Id = id;
            this.Intro = intro;
            this.Introfiles = introfiles;
            this.Introformat = introformat;
            this.Lang = lang;
            this.Legacyfiles = legacyfiles;
            this.Legacyfileslast = legacyfileslast;
            this.Name = name;
            this.Revision = revision;
            this.Section = section;
            this.Timemodified = timemodified;
            this.Tobemigrated = tobemigrated;
            this.Visible = visible;
        }

        /// <summary>
        /// Gets or Sets Contentfiles
        /// </summary>
        [DataMember(Name = "contentfiles", EmitDefaultValue = false)]
        public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> Contentfiles { get; set; }

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
        /// How to display the resource
        /// </summary>
        /// <value>How to display the resource</value>
        [DataMember(Name = "display", EmitDefaultValue = false)]
        public int Display { get; set; }

        /// <summary>
        /// Display options (width, height)
        /// </summary>
        /// <value>Display options (width, height)</value>
        [DataMember(Name = "displayoptions", EmitDefaultValue = false)]
        public string Displayoptions { get; set; }

        /// <summary>
        /// If filters should be applied to the resource content
        /// </summary>
        /// <value>If filters should be applied to the resource content</value>
        [DataMember(Name = "filterfiles", EmitDefaultValue = false)]
        public int Filterfiles { get; set; }

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
        /// Legacy files flag
        /// </summary>
        /// <value>Legacy files flag</value>
        [DataMember(Name = "legacyfiles", EmitDefaultValue = false)]
        public int Legacyfiles { get; set; }

        /// <summary>
        /// Legacy files last control flag
        /// </summary>
        /// <value>Legacy files last control flag</value>
        [DataMember(Name = "legacyfileslast", EmitDefaultValue = false)]
        public int Legacyfileslast { get; set; }

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
        /// Last time the resource was modified
        /// </summary>
        /// <value>Last time the resource was modified</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// Whether this resource was migrated
        /// </summary>
        /// <value>Whether this resource was migrated</value>
        [DataMember(Name = "tobemigrated", EmitDefaultValue = false)]
        public int Tobemigrated { get; set; }

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
            sb.Append("class ModResourceGetResourcesByCourses200ResponseResourcesInner {\n");
            sb.Append("  Contentfiles: ").Append(Contentfiles).Append("\n");
            sb.Append("  Course: ").Append(Course).Append("\n");
            sb.Append("  Coursemodule: ").Append(Coursemodule).Append("\n");
            sb.Append("  Display: ").Append(Display).Append("\n");
            sb.Append("  Displayoptions: ").Append(Displayoptions).Append("\n");
            sb.Append("  Filterfiles: ").Append(Filterfiles).Append("\n");
            sb.Append("  Groupingid: ").Append(Groupingid).Append("\n");
            sb.Append("  Groupmode: ").Append(Groupmode).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Intro: ").Append(Intro).Append("\n");
            sb.Append("  Introfiles: ").Append(Introfiles).Append("\n");
            sb.Append("  Introformat: ").Append(Introformat).Append("\n");
            sb.Append("  Lang: ").Append(Lang).Append("\n");
            sb.Append("  Legacyfiles: ").Append(Legacyfiles).Append("\n");
            sb.Append("  Legacyfileslast: ").Append(Legacyfileslast).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Revision: ").Append(Revision).Append("\n");
            sb.Append("  Section: ").Append(Section).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Tobemigrated: ").Append(Tobemigrated).Append("\n");
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