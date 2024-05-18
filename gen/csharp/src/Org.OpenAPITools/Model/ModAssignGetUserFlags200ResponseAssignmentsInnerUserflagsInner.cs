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
    /// ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner
    /// </summary>
    [DataContract(Name = "mod_assign_get_user_flags_200_response_assignments_inner_userflags_inner")]
    public partial class ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner" /> class.
        /// </summary>
        /// <param name="allocatedmarker">allocated marker (default to null).</param>
        /// <param name="extensionduedate">extension due date (default to null).</param>
        /// <param name="id">user flag id (default to null).</param>
        /// <param name="locked">locked (default to null).</param>
        /// <param name="mailed">mailed (default to null).</param>
        /// <param name="userid">student id.</param>
        /// <param name="workflowstate">marking workflow state (default to &quot;null&quot;).</param>
        public ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner(int allocatedmarker = null, int extensionduedate = null, int id = null, int locked = null, int mailed = null, int userid = default(int), string workflowstate = @"null")
        {
            this.Allocatedmarker = allocatedmarker;
            this.Extensionduedate = extensionduedate;
            this.Id = id;
            this.Locked = locked;
            this.Mailed = mailed;
            this.Userid = userid;
            // use default value if no "workflowstate" provided
            this.Workflowstate = workflowstate ?? @"null";
        }

        /// <summary>
        /// allocated marker
        /// </summary>
        /// <value>allocated marker</value>
        [DataMember(Name = "allocatedmarker", EmitDefaultValue = false)]
        public int Allocatedmarker { get; set; }

        /// <summary>
        /// extension due date
        /// </summary>
        /// <value>extension due date</value>
        [DataMember(Name = "extensionduedate", EmitDefaultValue = false)]
        public int Extensionduedate { get; set; }

        /// <summary>
        /// user flag id
        /// </summary>
        /// <value>user flag id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// locked
        /// </summary>
        /// <value>locked</value>
        [DataMember(Name = "locked", EmitDefaultValue = false)]
        public int Locked { get; set; }

        /// <summary>
        /// mailed
        /// </summary>
        /// <value>mailed</value>
        [DataMember(Name = "mailed", EmitDefaultValue = false)]
        public int Mailed { get; set; }

        /// <summary>
        /// student id
        /// </summary>
        /// <value>student id</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// marking workflow state
        /// </summary>
        /// <value>marking workflow state</value>
        [DataMember(Name = "workflowstate", EmitDefaultValue = false)]
        public string Workflowstate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner {\n");
            sb.Append("  Allocatedmarker: ").Append(Allocatedmarker).Append("\n");
            sb.Append("  Extensionduedate: ").Append(Extensionduedate).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Locked: ").Append(Locked).Append("\n");
            sb.Append("  Mailed: ").Append(Mailed).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("  Workflowstate: ").Append(Workflowstate).Append("\n");
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
