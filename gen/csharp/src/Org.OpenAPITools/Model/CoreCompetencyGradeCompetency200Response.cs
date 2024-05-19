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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreCompetencyGradeCompetency200Response
    /// </summary>
    [DataContract(Name = "core_competency_grade_competency_200_response")]
    public partial class CoreCompetencyGradeCompetency200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyGradeCompetency200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompetencyGradeCompetency200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyGradeCompetency200Response" /> class.
        /// </summary>
        /// <param name="action">action (required) (default to null).</param>
        /// <param name="actionuser">actionuser.</param>
        /// <param name="actionuserid">actionuserid (required) (default to null).</param>
        /// <param name="candelete">candelete (required).</param>
        /// <param name="contextid">contextid (required).</param>
        /// <param name="desca">desca (required) (default to &quot;null&quot;).</param>
        /// <param name="desccomponent">desccomponent (required) (default to &quot;null&quot;).</param>
        /// <param name="descidentifier">descidentifier (required) (default to &quot;null&quot;).</param>
        /// <param name="description">description (required).</param>
        /// <param name="grade">grade (required) (default to null).</param>
        /// <param name="gradename">gradename (required) (default to &quot;null&quot;).</param>
        /// <param name="id">id (required) (default to 0).</param>
        /// <param name="note">note (required) (default to &quot;null&quot;).</param>
        /// <param name="timecreated">timecreated (required) (default to 0).</param>
        /// <param name="timemodified">timemodified (required) (default to 0).</param>
        /// <param name="url">url (required) (default to &quot;null&quot;).</param>
        /// <param name="usercompetencyid">usercompetencyid (required) (default to null).</param>
        /// <param name="userdate">userdate (required) (default to &quot;null&quot;).</param>
        /// <param name="usermodified">usermodified (required) (default to 0).</param>
        public CoreCompetencyGradeCompetency200Response(int action = null, CoreCompetencyGradeCompetency200ResponseActionuser actionuser = default(CoreCompetencyGradeCompetency200ResponseActionuser), int actionuserid = null, bool candelete = default(bool), int contextid = default(int), string desca = @"null", string desccomponent = @"null", string descidentifier = @"null", string description = default(string), int grade = null, string gradename = @"null", int id = 0, string note = @"null", int timecreated = 0, int timemodified = 0, string url = @"null", int usercompetencyid = null, string userdate = @"null", int usermodified = 0)
        {
            this.Action = action;
            this.Actionuserid = actionuserid;
            this.Candelete = candelete;
            this.Contextid = contextid;
            // to ensure "desca" is required (not null)
            if (desca == null)
            {
                throw new ArgumentNullException("desca is a required property for CoreCompetencyGradeCompetency200Response and cannot be null");
            }
            this.Desca = desca;
            // to ensure "desccomponent" is required (not null)
            if (desccomponent == null)
            {
                throw new ArgumentNullException("desccomponent is a required property for CoreCompetencyGradeCompetency200Response and cannot be null");
            }
            this.Desccomponent = desccomponent;
            // to ensure "descidentifier" is required (not null)
            if (descidentifier == null)
            {
                throw new ArgumentNullException("descidentifier is a required property for CoreCompetencyGradeCompetency200Response and cannot be null");
            }
            this.Descidentifier = descidentifier;
            // to ensure "description" is required (not null)
            if (description == null)
            {
                throw new ArgumentNullException("description is a required property for CoreCompetencyGradeCompetency200Response and cannot be null");
            }
            this.Description = description;
            this.Grade = grade;
            // to ensure "gradename" is required (not null)
            if (gradename == null)
            {
                throw new ArgumentNullException("gradename is a required property for CoreCompetencyGradeCompetency200Response and cannot be null");
            }
            this.Gradename = gradename;
            this.Id = id;
            // to ensure "note" is required (not null)
            if (note == null)
            {
                throw new ArgumentNullException("note is a required property for CoreCompetencyGradeCompetency200Response and cannot be null");
            }
            this.Note = note;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CoreCompetencyGradeCompetency200Response and cannot be null");
            }
            this.Url = url;
            this.Usercompetencyid = usercompetencyid;
            // to ensure "userdate" is required (not null)
            if (userdate == null)
            {
                throw new ArgumentNullException("userdate is a required property for CoreCompetencyGradeCompetency200Response and cannot be null");
            }
            this.Userdate = userdate;
            this.Usermodified = usermodified;
            this.Actionuser = actionuser;
        }

        /// <summary>
        /// action
        /// </summary>
        /// <value>action</value>
        [DataMember(Name = "action", IsRequired = true, EmitDefaultValue = true)]
        public int Action { get; set; }

        /// <summary>
        /// Gets or Sets Actionuser
        /// </summary>
        [DataMember(Name = "actionuser", EmitDefaultValue = false)]
        public CoreCompetencyGradeCompetency200ResponseActionuser Actionuser { get; set; }

        /// <summary>
        /// actionuserid
        /// </summary>
        /// <value>actionuserid</value>
        [DataMember(Name = "actionuserid", IsRequired = true, EmitDefaultValue = true)]
        public int Actionuserid { get; set; }

        /// <summary>
        /// candelete
        /// </summary>
        /// <value>candelete</value>
        [DataMember(Name = "candelete", IsRequired = true, EmitDefaultValue = true)]
        public bool Candelete { get; set; }

        /// <summary>
        /// contextid
        /// </summary>
        /// <value>contextid</value>
        [DataMember(Name = "contextid", IsRequired = true, EmitDefaultValue = true)]
        public int Contextid { get; set; }

        /// <summary>
        /// desca
        /// </summary>
        /// <value>desca</value>
        [DataMember(Name = "desca", IsRequired = true, EmitDefaultValue = true)]
        public string Desca { get; set; }

        /// <summary>
        /// desccomponent
        /// </summary>
        /// <value>desccomponent</value>
        [DataMember(Name = "desccomponent", IsRequired = true, EmitDefaultValue = true)]
        public string Desccomponent { get; set; }

        /// <summary>
        /// descidentifier
        /// </summary>
        /// <value>descidentifier</value>
        [DataMember(Name = "descidentifier", IsRequired = true, EmitDefaultValue = true)]
        public string Descidentifier { get; set; }

        /// <summary>
        /// description
        /// </summary>
        /// <value>description</value>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// grade
        /// </summary>
        /// <value>grade</value>
        [DataMember(Name = "grade", IsRequired = true, EmitDefaultValue = true)]
        public int Grade { get; set; }

        /// <summary>
        /// gradename
        /// </summary>
        /// <value>gradename</value>
        [DataMember(Name = "gradename", IsRequired = true, EmitDefaultValue = true)]
        public string Gradename { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// note
        /// </summary>
        /// <value>note</value>
        [DataMember(Name = "note", IsRequired = true, EmitDefaultValue = true)]
        public string Note { get; set; }

        /// <summary>
        /// timecreated
        /// </summary>
        /// <value>timecreated</value>
        [DataMember(Name = "timecreated", IsRequired = true, EmitDefaultValue = true)]
        public int Timecreated { get; set; }

        /// <summary>
        /// timemodified
        /// </summary>
        /// <value>timemodified</value>
        [DataMember(Name = "timemodified", IsRequired = true, EmitDefaultValue = true)]
        public int Timemodified { get; set; }

        /// <summary>
        /// url
        /// </summary>
        /// <value>url</value>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// usercompetencyid
        /// </summary>
        /// <value>usercompetencyid</value>
        [DataMember(Name = "usercompetencyid", IsRequired = true, EmitDefaultValue = true)]
        public int Usercompetencyid { get; set; }

        /// <summary>
        /// userdate
        /// </summary>
        /// <value>userdate</value>
        [DataMember(Name = "userdate", IsRequired = true, EmitDefaultValue = true)]
        public string Userdate { get; set; }

        /// <summary>
        /// usermodified
        /// </summary>
        /// <value>usermodified</value>
        [DataMember(Name = "usermodified", IsRequired = true, EmitDefaultValue = true)]
        public int Usermodified { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencyGradeCompetency200Response {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Actionuser: ").Append(Actionuser).Append("\n");
            sb.Append("  Actionuserid: ").Append(Actionuserid).Append("\n");
            sb.Append("  Candelete: ").Append(Candelete).Append("\n");
            sb.Append("  Contextid: ").Append(Contextid).Append("\n");
            sb.Append("  Desca: ").Append(Desca).Append("\n");
            sb.Append("  Desccomponent: ").Append(Desccomponent).Append("\n");
            sb.Append("  Descidentifier: ").Append(Descidentifier).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Gradename: ").Append(Gradename).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Note: ").Append(Note).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Usercompetencyid: ").Append(Usercompetencyid).Append("\n");
            sb.Append("  Userdate: ").Append(Userdate).Append("\n");
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
