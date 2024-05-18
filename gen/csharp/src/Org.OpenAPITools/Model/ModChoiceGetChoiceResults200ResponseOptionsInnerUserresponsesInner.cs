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
    /// User responses
    /// </summary>
    [DataContract(Name = "mod_choice_get_choice_results_200_response_options_inner_userresponses_inner")]
    public partial class ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner" /> class.
        /// </summary>
        /// <param name="answerid">answer id (default to null).</param>
        /// <param name="fullname">user full name.</param>
        /// <param name="profileimageurl">profile user image url (default to &quot;null&quot;).</param>
        /// <param name="timemodified">time of modification (default to null).</param>
        /// <param name="userid">user id.</param>
        public ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner(int answerid = null, string fullname = default(string), string profileimageurl = @"null", int timemodified = null, int userid = default(int))
        {
            this.Answerid = answerid;
            this.Fullname = fullname;
            // use default value if no "profileimageurl" provided
            this.Profileimageurl = profileimageurl ?? @"null";
            this.Timemodified = timemodified;
            this.Userid = userid;
        }

        /// <summary>
        /// answer id
        /// </summary>
        /// <value>answer id</value>
        [DataMember(Name = "answerid", EmitDefaultValue = false)]
        public int Answerid { get; set; }

        /// <summary>
        /// user full name
        /// </summary>
        /// <value>user full name</value>
        [DataMember(Name = "fullname", EmitDefaultValue = false)]
        public string Fullname { get; set; }

        /// <summary>
        /// profile user image url
        /// </summary>
        /// <value>profile user image url</value>
        [DataMember(Name = "profileimageurl", EmitDefaultValue = false)]
        public string Profileimageurl { get; set; }

        /// <summary>
        /// time of modification
        /// </summary>
        /// <value>time of modification</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// user id
        /// </summary>
        /// <value>user id</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner {\n");
            sb.Append("  Answerid: ").Append(Answerid).Append("\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  Profileimageurl: ").Append(Profileimageurl).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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
