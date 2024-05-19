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
    /// CoreCompetencyCreatePlan200ResponseCommentarea
    /// </summary>
    [DataContract(Name = "core_competency_create_plan_200_response_commentarea")]
    public partial class CoreCompetencyCreatePlan200ResponseCommentarea : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyCreatePlan200ResponseCommentarea" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompetencyCreatePlan200ResponseCommentarea() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyCreatePlan200ResponseCommentarea" /> class.
        /// </summary>
        /// <param name="autostart">autostart (required) (default to null).</param>
        /// <param name="canpost">canpost (required) (default to null).</param>
        /// <param name="canpostorhascomments">canpostorhascomments (required) (default to null).</param>
        /// <param name="canview">canview (required) (default to null).</param>
        /// <param name="cid">cid (required) (default to &quot;null&quot;).</param>
        /// <param name="collapsediconkey">collapsediconkey (required) (default to &quot;null&quot;).</param>
        /// <param name="commentarea">commentarea (required) (default to &quot;null&quot;).</param>
        /// <param name="component">component (required).</param>
        /// <param name="contextid">contextid (required).</param>
        /// <param name="count">count (required) (default to null).</param>
        /// <param name="courseid">courseid (required).</param>
        /// <param name="displaycancel">displaycancel (required) (default to null).</param>
        /// <param name="displaytotalcount">displaytotalcount (required) (default to null).</param>
        /// <param name="fullwidth">fullwidth (required) (default to null).</param>
        /// <param name="itemid">itemid (required) (default to null).</param>
        /// <param name="linktext">linktext (required) (default to &quot;null&quot;).</param>
        /// <param name="notoggle">notoggle (required) (default to null).</param>
        /// <param name="template">template (required) (default to &quot;null&quot;).</param>
        public CoreCompetencyCreatePlan200ResponseCommentarea(bool autostart = null, bool canpost = null, bool canpostorhascomments = null, bool canview = null, string cid = @"null", string collapsediconkey = @"null", string commentarea = @"null", string component = default(string), int contextid = default(int), int count = null, int courseid = default(int), bool displaycancel = null, bool displaytotalcount = null, bool fullwidth = null, int itemid = null, string linktext = @"null", bool notoggle = null, string template = @"null")
        {
            this.Autostart = autostart;
            this.Canpost = canpost;
            this.Canpostorhascomments = canpostorhascomments;
            this.Canview = canview;
            // to ensure "cid" is required (not null)
            if (cid == null)
            {
                throw new ArgumentNullException("cid is a required property for CoreCompetencyCreatePlan200ResponseCommentarea and cannot be null");
            }
            this.Cid = cid;
            // to ensure "collapsediconkey" is required (not null)
            if (collapsediconkey == null)
            {
                throw new ArgumentNullException("collapsediconkey is a required property for CoreCompetencyCreatePlan200ResponseCommentarea and cannot be null");
            }
            this.Collapsediconkey = collapsediconkey;
            // to ensure "commentarea" is required (not null)
            if (commentarea == null)
            {
                throw new ArgumentNullException("commentarea is a required property for CoreCompetencyCreatePlan200ResponseCommentarea and cannot be null");
            }
            this.Commentarea = commentarea;
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for CoreCompetencyCreatePlan200ResponseCommentarea and cannot be null");
            }
            this.Component = component;
            this.Contextid = contextid;
            this.Count = count;
            this.Courseid = courseid;
            this.Displaycancel = displaycancel;
            this.Displaytotalcount = displaytotalcount;
            this.Fullwidth = fullwidth;
            this.Itemid = itemid;
            // to ensure "linktext" is required (not null)
            if (linktext == null)
            {
                throw new ArgumentNullException("linktext is a required property for CoreCompetencyCreatePlan200ResponseCommentarea and cannot be null");
            }
            this.Linktext = linktext;
            this.Notoggle = notoggle;
            // to ensure "template" is required (not null)
            if (template == null)
            {
                throw new ArgumentNullException("template is a required property for CoreCompetencyCreatePlan200ResponseCommentarea and cannot be null");
            }
            this.Template = template;
        }

        /// <summary>
        /// autostart
        /// </summary>
        /// <value>autostart</value>
        [DataMember(Name = "autostart", IsRequired = true, EmitDefaultValue = true)]
        public bool Autostart { get; set; }

        /// <summary>
        /// canpost
        /// </summary>
        /// <value>canpost</value>
        [DataMember(Name = "canpost", IsRequired = true, EmitDefaultValue = true)]
        public bool Canpost { get; set; }

        /// <summary>
        /// canpostorhascomments
        /// </summary>
        /// <value>canpostorhascomments</value>
        [DataMember(Name = "canpostorhascomments", IsRequired = true, EmitDefaultValue = true)]
        public bool Canpostorhascomments { get; set; }

        /// <summary>
        /// canview
        /// </summary>
        /// <value>canview</value>
        [DataMember(Name = "canview", IsRequired = true, EmitDefaultValue = true)]
        public bool Canview { get; set; }

        /// <summary>
        /// cid
        /// </summary>
        /// <value>cid</value>
        [DataMember(Name = "cid", IsRequired = true, EmitDefaultValue = true)]
        public string Cid { get; set; }

        /// <summary>
        /// collapsediconkey
        /// </summary>
        /// <value>collapsediconkey</value>
        [DataMember(Name = "collapsediconkey", IsRequired = true, EmitDefaultValue = true)]
        public string Collapsediconkey { get; set; }

        /// <summary>
        /// commentarea
        /// </summary>
        /// <value>commentarea</value>
        [DataMember(Name = "commentarea", IsRequired = true, EmitDefaultValue = true)]
        public string Commentarea { get; set; }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", IsRequired = true, EmitDefaultValue = true)]
        public string Component { get; set; }

        /// <summary>
        /// contextid
        /// </summary>
        /// <value>contextid</value>
        [DataMember(Name = "contextid", IsRequired = true, EmitDefaultValue = true)]
        public int Contextid { get; set; }

        /// <summary>
        /// count
        /// </summary>
        /// <value>count</value>
        [DataMember(Name = "count", IsRequired = true, EmitDefaultValue = true)]
        public int Count { get; set; }

        /// <summary>
        /// courseid
        /// </summary>
        /// <value>courseid</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// displaycancel
        /// </summary>
        /// <value>displaycancel</value>
        [DataMember(Name = "displaycancel", IsRequired = true, EmitDefaultValue = true)]
        public bool Displaycancel { get; set; }

        /// <summary>
        /// displaytotalcount
        /// </summary>
        /// <value>displaytotalcount</value>
        [DataMember(Name = "displaytotalcount", IsRequired = true, EmitDefaultValue = true)]
        public bool Displaytotalcount { get; set; }

        /// <summary>
        /// fullwidth
        /// </summary>
        /// <value>fullwidth</value>
        [DataMember(Name = "fullwidth", IsRequired = true, EmitDefaultValue = true)]
        public bool Fullwidth { get; set; }

        /// <summary>
        /// itemid
        /// </summary>
        /// <value>itemid</value>
        [DataMember(Name = "itemid", IsRequired = true, EmitDefaultValue = true)]
        public int Itemid { get; set; }

        /// <summary>
        /// linktext
        /// </summary>
        /// <value>linktext</value>
        [DataMember(Name = "linktext", IsRequired = true, EmitDefaultValue = true)]
        public string Linktext { get; set; }

        /// <summary>
        /// notoggle
        /// </summary>
        /// <value>notoggle</value>
        [DataMember(Name = "notoggle", IsRequired = true, EmitDefaultValue = true)]
        public bool Notoggle { get; set; }

        /// <summary>
        /// template
        /// </summary>
        /// <value>template</value>
        [DataMember(Name = "template", IsRequired = true, EmitDefaultValue = true)]
        public string Template { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencyCreatePlan200ResponseCommentarea {\n");
            sb.Append("  Autostart: ").Append(Autostart).Append("\n");
            sb.Append("  Canpost: ").Append(Canpost).Append("\n");
            sb.Append("  Canpostorhascomments: ").Append(Canpostorhascomments).Append("\n");
            sb.Append("  Canview: ").Append(Canview).Append("\n");
            sb.Append("  Cid: ").Append(Cid).Append("\n");
            sb.Append("  Collapsediconkey: ").Append(Collapsediconkey).Append("\n");
            sb.Append("  Commentarea: ").Append(Commentarea).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Contextid: ").Append(Contextid).Append("\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Displaycancel: ").Append(Displaycancel).Append("\n");
            sb.Append("  Displaytotalcount: ").Append(Displaytotalcount).Append("\n");
            sb.Append("  Fullwidth: ").Append(Fullwidth).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
            sb.Append("  Linktext: ").Append(Linktext).Append("\n");
            sb.Append("  Notoggle: ").Append(Notoggle).Append("\n");
            sb.Append("  Template: ").Append(Template).Append("\n");
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
