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
    /// CoreReportbuilderListReports200ResponseReportsInner
    /// </summary>
    [DataContract(Name = "core_reportbuilder_list_reports_200_response_reports_inner")]
    public partial class CoreReportbuilderListReports200ResponseReportsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderListReports200ResponseReportsInner" /> class.
        /// </summary>
        /// <param name="area">area (default to &quot;&quot;).</param>
        /// <param name="component">component (default to &quot;&quot;).</param>
        /// <param name="conditiondata">conditiondata (default to &quot;null&quot;).</param>
        /// <param name="contextid">contextid (default to {}).</param>
        /// <param name="id">id (default to 0).</param>
        /// <param name="itemid">itemid (default to 0).</param>
        /// <param name="modifiedby">modifiedby.</param>
        /// <param name="name">name.</param>
        /// <param name="settingsdata">settingsdata (default to &quot;null&quot;).</param>
        /// <param name="source">source (default to &quot;null&quot;).</param>
        /// <param name="sourcename">sourcename (default to &quot;null&quot;).</param>
        /// <param name="timecreated">timecreated (default to 0).</param>
        /// <param name="timemodified">timemodified (default to 0).</param>
        /// <param name="type">type (default to null).</param>
        /// <param name="uniquerows">uniquerows (default to false).</param>
        /// <param name="usercreated">usercreated (default to {}).</param>
        /// <param name="usermodified">usermodified (default to 0).</param>
        public CoreReportbuilderListReports200ResponseReportsInner(string area = @"", string component = @"", string conditiondata = @"null", int contextid = {}, int id = 0, int itemid = 0, CoreCompetencyGradeCompetency200ResponseActionuser modifiedby = default(CoreCompetencyGradeCompetency200ResponseActionuser), string name = default(string), string settingsdata = @"null", string source = @"null", string sourcename = @"null", int timecreated = 0, int timemodified = 0, int type = null, bool uniquerows = false, int usercreated = {}, int usermodified = 0)
        {
            // use default value if no "area" provided
            this.Area = area ?? @"";
            // use default value if no "component" provided
            this.Component = component ?? @"";
            // use default value if no "conditiondata" provided
            this.Conditiondata = conditiondata ?? @"null";
            this.Contextid = contextid;
            this.Id = id;
            this.Itemid = itemid;
            this.Modifiedby = modifiedby;
            this.Name = name;
            // use default value if no "settingsdata" provided
            this.Settingsdata = settingsdata ?? @"null";
            // use default value if no "source" provided
            this.Source = source ?? @"null";
            // use default value if no "sourcename" provided
            this.Sourcename = sourcename ?? @"null";
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Type = type;
            this.Uniquerows = uniquerows;
            this.Usercreated = usercreated;
            this.Usermodified = usermodified;
        }

        /// <summary>
        /// area
        /// </summary>
        /// <value>area</value>
        [DataMember(Name = "area", EmitDefaultValue = false)]
        public string Area { get; set; }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", EmitDefaultValue = false)]
        public string Component { get; set; }

        /// <summary>
        /// conditiondata
        /// </summary>
        /// <value>conditiondata</value>
        [DataMember(Name = "conditiondata", EmitDefaultValue = false)]
        public string Conditiondata { get; set; }

        /// <summary>
        /// contextid
        /// </summary>
        /// <value>contextid</value>
        [DataMember(Name = "contextid", EmitDefaultValue = false)]
        public int Contextid { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// itemid
        /// </summary>
        /// <value>itemid</value>
        [DataMember(Name = "itemid", EmitDefaultValue = false)]
        public int Itemid { get; set; }

        /// <summary>
        /// Gets or Sets Modifiedby
        /// </summary>
        [DataMember(Name = "modifiedby", EmitDefaultValue = false)]
        public CoreCompetencyGradeCompetency200ResponseActionuser Modifiedby { get; set; }

        /// <summary>
        /// name
        /// </summary>
        /// <value>name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// settingsdata
        /// </summary>
        /// <value>settingsdata</value>
        [DataMember(Name = "settingsdata", EmitDefaultValue = false)]
        public string Settingsdata { get; set; }

        /// <summary>
        /// source
        /// </summary>
        /// <value>source</value>
        [DataMember(Name = "source", EmitDefaultValue = false)]
        public string Source { get; set; }

        /// <summary>
        /// sourcename
        /// </summary>
        /// <value>sourcename</value>
        [DataMember(Name = "sourcename", EmitDefaultValue = false)]
        public string Sourcename { get; set; }

        /// <summary>
        /// timecreated
        /// </summary>
        /// <value>timecreated</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// timemodified
        /// </summary>
        /// <value>timemodified</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// type
        /// </summary>
        /// <value>type</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public int Type { get; set; }

        /// <summary>
        /// uniquerows
        /// </summary>
        /// <value>uniquerows</value>
        [DataMember(Name = "uniquerows", EmitDefaultValue = true)]
        public bool Uniquerows { get; set; }

        /// <summary>
        /// usercreated
        /// </summary>
        /// <value>usercreated</value>
        [DataMember(Name = "usercreated", EmitDefaultValue = false)]
        public int Usercreated { get; set; }

        /// <summary>
        /// usermodified
        /// </summary>
        /// <value>usermodified</value>
        [DataMember(Name = "usermodified", EmitDefaultValue = false)]
        public int Usermodified { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreReportbuilderListReports200ResponseReportsInner {\n");
            sb.Append("  Area: ").Append(Area).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Conditiondata: ").Append(Conditiondata).Append("\n");
            sb.Append("  Contextid: ").Append(Contextid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
            sb.Append("  Modifiedby: ").Append(Modifiedby).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Settingsdata: ").Append(Settingsdata).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Sourcename: ").Append(Sourcename).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Uniquerows: ").Append(Uniquerows).Append("\n");
            sb.Append("  Usercreated: ").Append(Usercreated).Append("\n");
            sb.Append("  Usermodified: ").Append(Usermodified).Append("\n");
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
