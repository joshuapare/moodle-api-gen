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
    /// CoreCourseformatUpdateCourseRequest
    /// </summary>
    [DataContract(Name = "core_courseformat_update_course_request")]
    public partial class CoreCourseformatUpdateCourseRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseformatUpdateCourseRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseformatUpdateCourseRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseformatUpdateCourseRequest" /> class.
        /// </summary>
        /// <param name="action">action: cm_hide, cm_show, section_hide, section_show, cm_moveleft... (required) (default to &quot;null&quot;).</param>
        /// <param name="courseid">course id (required).</param>
        /// <param name="ids">ids.</param>
        /// <param name="targetcmid">Optional target cm id (default to null).</param>
        /// <param name="targetsectionid">Optional target section id (default to null).</param>
        public CoreCourseformatUpdateCourseRequest(string action = @"null", int courseid = default(int), List<Object> ids = default(List<Object>), int targetcmid = null, int targetsectionid = null)
        {
            // to ensure "action" is required (not null)
            if (action == null)
            {
                throw new ArgumentNullException("action is a required property for CoreCourseformatUpdateCourseRequest and cannot be null");
            }
            this.Action = action;
            this.Courseid = courseid;
            this.Ids = ids;
            this.Targetcmid = targetcmid;
            this.Targetsectionid = targetsectionid;
        }

        /// <summary>
        /// action: cm_hide, cm_show, section_hide, section_show, cm_moveleft...
        /// </summary>
        /// <value>action: cm_hide, cm_show, section_hide, section_show, cm_moveleft...</value>
        [DataMember(Name = "action", IsRequired = true, EmitDefaultValue = true)]
        public string Action { get; set; }

        /// <summary>
        /// course id
        /// </summary>
        /// <value>course id</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// Gets or Sets Ids
        /// </summary>
        [DataMember(Name = "ids", EmitDefaultValue = false)]
        public List<Object> Ids { get; set; }

        /// <summary>
        /// Optional target cm id
        /// </summary>
        /// <value>Optional target cm id</value>
        [DataMember(Name = "targetcmid", EmitDefaultValue = false)]
        public int Targetcmid { get; set; }

        /// <summary>
        /// Optional target section id
        /// </summary>
        /// <value>Optional target section id</value>
        [DataMember(Name = "targetsectionid", EmitDefaultValue = false)]
        public int Targetsectionid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseformatUpdateCourseRequest {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  Targetcmid: ").Append(Targetcmid).Append("\n");
            sb.Append("  Targetsectionid: ").Append(Targetsectionid).Append("\n");
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